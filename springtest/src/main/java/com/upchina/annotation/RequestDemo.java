package com.upchina.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/** 
* Created by anjunli on 2021年2月8日
*/
@SpringBootApplication
@RestController
public class RequestDemo {
	public static void main(String[] args) {
		SpringApplication.run(RequestDemo.class, args);
	}
	
	@RequestMapping("/")
	public String start() {
		return "hello,world!";
	}
	
	@RequestMapping("/hello")
	public String getName(@RequestParam(value="demo",required = false,defaultValue = "tom")String name) {
		return String.format("hello,%s", name);
	}
	
}
