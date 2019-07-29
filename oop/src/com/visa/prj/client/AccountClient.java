package com.visa.prj.client;

import com.visa.prj.entity.Account;

public class AccountClient {

	public static void main(String[] args) {
		
		Account first = new Account();
		Account second = new Account();
		
		first.deposit(5000); //deposit(first,50000);
	
		second.deposit(3500);
		
		System.out.println("First Account: " + first.getBalance());
		System.out.println("Second Account: " + second.getBalance());
		
		
		first = null;
		second = null;

		System.out.println(Account.getCount());
		
		//System.gc();
	}
}
