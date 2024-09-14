package com.bank.hdfc;

import org.springframework.stereotype.Component;

import com.bank.Bank;

@Component("hdfc")
public class HdfcBank implements Bank {
	public int balance=25000;
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
