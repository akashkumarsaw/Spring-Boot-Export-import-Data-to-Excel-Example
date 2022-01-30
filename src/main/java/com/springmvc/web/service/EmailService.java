package com.springmvc.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.springmvc.web.modelrepository.StudentRepo;
import com.springmvc.web.models.Student;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;	
	
	@Autowired
	StudentRepo repository;
	
	public void sendEmail(
			String toEMail,
			String body,
			String subject) {
		SimpleMailMessage message=new SimpleMailMessage();
		
		message.setFrom("realuserreviewpoint@gmail.com");
		message.setTo(toEMail);
		message.setText(subject);
		message.setSubject(subject);
		System.out.println("email to:"+toEMail);
		javaMailSender.send(message);
	}
	
	@Scheduled(fixedDelay = 10000)
	public void sendEmails() {
		List<Student> students=repository.findAll();
		for (Student student : students) {
			sendEmail(student.getEmail(), "welcome to demo world", "demo");
		}
	}
	
}
