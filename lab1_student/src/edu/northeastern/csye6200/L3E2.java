package edu.northeastern.csye6200;

import java.util.Scanner;

public class L3E2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i;
		i = getDouble();
		System.out.print("got" + i);
		
		}
	
	public static double getDouble() {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a double: ");
	double input_value = input.nextDouble();
	return input_value;
	}

}
