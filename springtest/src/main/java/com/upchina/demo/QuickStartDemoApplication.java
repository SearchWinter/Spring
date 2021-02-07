package com.upchina.demo;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/** 
 * https://spring.io/quickstart
 * */
@SpringBootApplication
@RestController
public class QuickStartDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickStartDemoApplication.class, args);
    }
    
    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name",defaultValue="world") String name ) {
    	return String.format("Hello %s! demo", name);
    }
    @RequestMapping("/")
    public String start() {
    	return "welcome";
    }
}
