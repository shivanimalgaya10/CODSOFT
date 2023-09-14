
package com.nt.bank;
import java.util.Scanner;

public class BankAccount {
	public double balance;
	
	public BankAccount(double intialbalance) {
		balance=intialbalance;
		
	}
	public double getBalance() {
		return balance;
	}
	
	public double deposit(double amount) {
		balance+=amount;
		return balance;
	}
	
	public boolean withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
			return true;
		}
		else {
			return false;
		}
			
	}

}
