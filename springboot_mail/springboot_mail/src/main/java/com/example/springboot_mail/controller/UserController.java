package com.example.springboot_mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_mail.dto.UserEmail;
import com.example.springboot_mail.service.UserService;

import jakarta.mail.MessagingException;
@RestController
public class UserController {

	@Autowired
	public UserService service;
	
	@GetMapping("/mail")
	public void SendEmail(@RequestBody UserEmail email) {
//		System.out.println(email);
		service.sendMsg(email);
	}
	@GetMapping("/otp")
	public void SendOtp(@RequestBody UserEmail email) {
		service.sendOtp(email);
	}
	
	@GetMapping("/attachement")
	public void sendAttachementFile(@RequestBody UserEmail email) {
		try {
			service.sendAttachement(email);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
