package com.userProject.Form.service;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userProject.Form.constant.ApplicationConstants;
import com.userProject.Form.dto.RequestDto;
import com.userProject.Form.dto.ResponceDto;
import com.userProject.Form.entity.UserEntity;
import com.userProject.Form.exceptionHendling.ResourceNotAvailableException;
import com.userProject.Form.repositories.UserRepositorty;
@Service
public class UserService {

	@Autowired
	private UserRepositorty userRepositorty;
	
	public ResponceDto save(RequestDto requestDto) {
		UserEntity userEntity=new UserEntity();
		BeanUtils.copyProperties(requestDto, userEntity);
		userEntity=userRepositorty.save(userEntity);
		return convertEntityToResponce(userEntity) ;
	}

	public List<ResponceDto> findAll() {
		return userRepositorty.findAll().stream().map(this::convertEntityToResponce).collect(Collectors.toList());
	}

	public ResponceDto findById(Integer id) {
		UserEntity userEntity=userRepositorty.findById(id).get();
//	.orElseThrow(()->new ResourceNotAvailableException(ApplicationConstants.Uesr_Not_Found));
		return convertEntityToResponce(userEntity);
	}
	

	public ResponceDto findByLogin(String email, String pasword) {
		 UserEntity userEntity=userRepositorty.findByLogin(email,pasword)
				 .orElseThrow(()->new ResourceNotAvailableException(ApplicationConstants.Uesr_Not_Found));
		return convertEntityToResponce(userEntity);
	}

//	public ResponceDto update(RequestDto requestDto) {
//		
//		return null;
//	}
	
	public ResponceDto convertEntityToResponce(UserEntity userEntity) {
		ResponceDto responceDto=new ResponceDto();
		BeanUtils.copyProperties(userEntity, responceDto);
		return responceDto;
		}


}
