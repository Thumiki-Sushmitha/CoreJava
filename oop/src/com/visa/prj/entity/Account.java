package com.visa.prj.entity;
/**
 * This is a class to represent account business data.
 * It allows to credit and debit account
 * @author sushmitha
 * @version 1.0
 */
public class Account {
	private double balance; //state of the object --> instance variables
	
	private static int count; 
 	
	public Account() {
		count++;
	}
	/**
	 * method to credit amount into account
	 * @param amt amount to be credited
	 */
	public void deposit(double amt) { //public void deposit(Account this,double amt)
		balance += amt;						//this.balance += amt;
	}
	
	/**
	 * method returns the current balance in the account
	 * @return the current balance
	 */
	public double getBalance() {
		return balance;
	}
	
	public static int getCount() {
		return count;
	}
}
