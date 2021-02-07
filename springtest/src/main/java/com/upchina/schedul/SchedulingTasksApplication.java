package com.upchina.schedul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/** 
* Created by anjunli on 2021年2月3日
*/
@ComponentScan("com.upchina.schedule2")
@EnableScheduling
@SpringBootApplication
public class SchedulingTasksApplication {
	public static void main(String[] args) {
		SpringApplication.run(SchedulingTasksApplication.class);
	}
}
