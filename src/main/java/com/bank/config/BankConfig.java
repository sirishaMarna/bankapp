package com.bank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bank.axis.AxisBank;

@Configuration
@ComponentScan(basePackages = "com.bank")
public class BankConfig {

	@Bean
	public AxisBank getBank() {
		return new AxisBank();
	}
}
