package com.userProject.Form.dto;

import com.userProject.Form.entity.UserEntity;

import lombok.Data;

@Data
public class ResponceDto {

	private int id;
	private String name;
	private long phone;
	private String email;
	private String gender;
	
}
