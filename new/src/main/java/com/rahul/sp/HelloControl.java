package com.rahul.sp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class HelloControl {
	
	@RequestMapping("/hello")
	public String sayhi() {
		return "hi";
	}
	
	@RequestMapping("/helloRahul")
    public String shello() {
		return "Rahul Hello";
	}
	
}
