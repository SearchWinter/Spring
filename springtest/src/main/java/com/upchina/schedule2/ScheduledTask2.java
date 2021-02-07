package com.upchina.schedule2;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/** 
* Created by anjunli on 2021年2月4日
*/

@Component
public class ScheduledTask2 {
	private static final SimpleDateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");
	
//	@Scheduled(cron="0/1 * * * * ?")
	@Scheduled(initialDelay = 5000,fixedDelay = 3000)
	public void reportCurrentTime() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" | task2 | The time is now "+dateFormat.format(new Date()));
	}
}
