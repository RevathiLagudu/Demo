package com.userProject.Form.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userProject.Form.dto.ResponceDto;
import com.userProject.Form.entity.UserEntity;



public interface UserRepositorty extends JpaRepository<UserEntity,Integer > {

	 public ResponceDto findByLogin(String email, String pasword);


	
}
