package com.coderlong.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coderlong.service.impl.CustomerServiceImpl;

public class CustomerServiceTest {
	
	@Test
	public void test() {
		ClassPathXmlApplicationContext classPathXmlApplicationContext =  new ClassPathXmlApplicationContext("classpath*:spring/applicationContext-*.xml");
		
		CustomerService service = (CustomerService) classPathXmlApplicationContext.getBean("customerService");
		service.findOne("111");
	}

}
