package com.bank.ac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.bank.Bank;
import com.bank.axis.AxisBank;

@Component("acService")
public class AccountService {
	@Autowired
	@Qualifier("hdfc")
	public Bank bank;
	@Autowired
	public AxisBank axisBank;
	
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int balance = 2000;
	public int getBanlance() {
		return balance;
	}
	public AxisBank getAxisBank() {
		return axisBank;
	}
	public void setAxisBank(AxisBank axisBank) {
		this.axisBank = axisBank;
	}
	

}
