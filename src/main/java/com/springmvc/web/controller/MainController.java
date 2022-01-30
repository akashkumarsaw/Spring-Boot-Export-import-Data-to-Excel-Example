package com.springmvc.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.web.service.EmailService;


@Controller
public class MainController {
	//@Autowired
	//EmailService emailService;
	
	@RequestMapping("/")
	public String home() {
		//emailService.sendEmails();
		return "home";
	}
	
	
}
