package com.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bank.ac.AccountService;
import com.bank.axis.AxisBank;
import com.bank.config.BankConfig;

public class Test {
	
	public static void main(String[] args) {
		
		
		//ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(BankConfig.class);
		
		AccountService acs = ac.getBean("acService",AccountService.class);
		int balance = acs.getBanlance();
		
		Bank b = acs.getBank();
		
		int wdr = b.withdraw(10000);
		System.out.println(wdr);
		
		System.out.println(balance);
	
		AxisBank axisBank =  acs.getAxisBank();
		axisBank.disply();
	
	}

}
