package com.zeta.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class HelloWorldController {

	@RequestMapping({ "/hello" })
	public String hello() {
		return "Hello World";
	}
	
	@RequestMapping({ "/api/ex/1" })
	public String hello1() {
		return "Hello World";
	}
	
	@RequestMapping({ "/api/exx" })
	public String hello2() {
		return "Hello World";
	}

}
