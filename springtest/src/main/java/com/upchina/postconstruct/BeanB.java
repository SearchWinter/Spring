package com.upchina.postconstruct;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

/** 
* Created by anjunli on 2021年2月4日
*/

@Service
public class BeanB {
	@PostConstruct
	private void init() {
		System.out.println("BeanB 的init方法");
	}
	
	public BeanB() {
		System.out.println("BeanB 的构造方法");
	}
	
//	同一个类中，可以有多个PostConstruct注解
	@PostConstruct
	public void init2() {
		System.out.println("BeanB 的init2方法");
	}
	
	void testB() {
		System.out.println("BeanB 的test方法");
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("BeanB 的destory方法");
	}
}
