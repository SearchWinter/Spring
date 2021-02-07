package com.upchina.schedul;
/** 
* Created by anjunli on 2021年2月3日
*/

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/** 多任务并发*/
//@Component
@EnableAsync
public class ScheduledTasks {
	private static final SimpleDateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(cron="0/1 * * * * ?")
	@Async
	public void task1() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" Task1 | The time is now "+dateFormat.format(new Date()));
	}
	
	@Async
	@Scheduled(cron = "0/1 * * * * ?")
	public void task2() {
		System.out.println(Thread.currentThread().getName()+" | Task2 ");
	}
}
