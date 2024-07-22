package com.example.springboot_mail.dto;

import lombok.Data;

@Data
public class UserEmail {

	private String to;
	private String subject;
	private String body;
}
