package com.upchina.postconstruct;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** 
* Created by anjunli on 2021年2月4日
*/

@Service
public class BeanA {
	@Autowired
	private BeanB beanB;
	
	public BeanA() {
		System.out.println("BeanA 的构造方法");
	}
	
	@PostConstruct
	private void init() {
		System.out.println("BeanA 的init方法");
		beanB.testB();
	}
	
	@PreDestroy
	private void aDestory() {
		System.out.println("BeanA 的destory方法");
	}
}
