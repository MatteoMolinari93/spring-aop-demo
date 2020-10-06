package com.molim.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.molim.aopdemo.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class)) {
			AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
			
			accountDAO.getName();
			accountDAO.getServiceCode();
			accountDAO.addAccount(new Account(), true);
		}
	}

}
