package com.userProject.Form.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userProject.Form.dto.RequestDto;
import com.userProject.Form.dto.ResponceDto;
import com.userProject.Form.service.UserService;
@RestController
@RequestMapping("/form")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping
	public ResponceDto createform(@RequestBody RequestDto requestDto) {
		return userService.save(requestDto);
	}
	@GetMapping
	public List<ResponceDto> fechAll(){
		return userService.findAll();
	}
	@GetMapping("/id")
	public ResponceDto detailsById(@PathVariable Integer id) {
		return userService.findById(id);
	}
	@GetMapping("/login/{email}/{pasword}")
	public ResponceDto login(@PathVariable String email,String pasword) {
		return userService.findByLogin(email,pasword);
	}
//	@PostMapping
//	public ResponceDto updateUser(@RequestBody RequestDto requestDto) {
//		return userService.update(requestDto);
//	}

}
