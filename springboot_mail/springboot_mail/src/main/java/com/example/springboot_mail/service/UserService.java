package com.example.springboot_mail.service;

import java.io.File;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.springboot_mail.dto.UserEmail;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
@Service
public class UserService {
	@Autowired
	private JavaMailSender emailSender;
	
	public void sendMsg(UserEmail email) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("revathilagudu2002@gmail.com");
		message.setTo(email.getTo());
		message.setSubject(email.getSubject());
		message.setText(email.getBody());
		emailSender.send(message);
	}
	
	public void sendOtp(UserEmail email) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("revathitrendy@gmail.com");
		message.setTo(email.getTo());
		message.setSubject(email.getSubject());
		Random random=new Random();
		int otp=random.nextInt(900000);
		message.setText("otp verification \n" +"enter the otp as"+otp);
		emailSender.send(message);
	}
	
	public void sendAttachement(UserEmail email) throws MessagingException {
		MimeMessage message=emailSender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(message,true);
		helper.setFrom("revathilagudu2002@gmail.com");
		helper.setTo(email.getTo());
		helper.setSubject(email.getSubject());
		helper.setText(email.getBody());
		FileSystemResource file=new FileSystemResource(new File("D:\\AdvanceJava\\image.webp"));
		helper.addAttachment("fish.webp",file);
		emailSender.send(message);
		}
}
