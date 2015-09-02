package com.priyank.aop.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.priyank.aop.bo.CustomerBO;

public class App {
	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "Spring-Customer.xml" });
		CustomerBO customer = (CustomerBO) appContext.getBean("customerBO");
		customer.addCustomer();
		customer.addCustomerReturnValue();
	}
}