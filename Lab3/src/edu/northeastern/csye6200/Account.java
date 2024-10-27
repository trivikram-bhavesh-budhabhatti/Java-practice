package edu.northeastern.csye6200;

public class Account {
	private String name;
	private double balance;
	
	public Account(String accountName, double initialBalance) {
		this.name = accountName;
		this.balance = initialBalance;
	}
	public String toString() {
		String output = name;
		output += String.format(": %.2f", balance);
		return output;
	}

}
