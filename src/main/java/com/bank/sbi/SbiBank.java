package com.bank.sbi;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.bank.Bank;

@Component
@Primary
public class SbiBank implements Bank{
	public int balance=20000;
	public int withdraw(int amount) {
		// TODO Auto-generated method stub
		int withDraw=0;
		if(amount<=balance) {
			withDraw = balance-amount;
		}else {
			System.out.println("Sorry Insuffent Funds");
		}
		
		return withDraw;
	}

}
