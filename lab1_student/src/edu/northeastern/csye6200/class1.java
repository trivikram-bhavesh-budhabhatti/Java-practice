package edu.northeastern.csye6200;

import java.util.Scanner;

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number1");
//        double a = scanner.nextInt();
//        System.out.println("Enter number2");
//        double b = scanner.nextInt();
//        System.out.println("Enter number3");
//        double c = scanner.nextInt();
//        double total = (a+b+c)/3.0;
//        System.out.print("average:"+ total );
//        
		

//		double value1= 3.21321;
////		Int value2 = 13
////		System.out.printf("result is %.3f and %d", value1, value2);
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter number1");
//		double a = scanner.nextDouble();
//		System.out.printf("rounded to 3 decimal : %.3f %n",a);
		
		int input_value ;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter number1");
			input_value = scanner.nextInt();
		}
		while(input_value<1 || input_value>100);
	}

}
