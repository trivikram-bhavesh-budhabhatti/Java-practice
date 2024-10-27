package edu.northeastern.csye6200;
import java.util.Scanner;


public class Lecture9E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("enter an integer");
//		Scanner sc = new Scanner(System.in);
//		int inp = sc.nextInt();
//		Integer value = new Integer(inp);
//		System.out.println("the input value is " + value.intValue());
//		sc.close();
		System.out.println(Integer.parseInt("14"));
		System.out.println(Integer.parseInt("14",10));
		System.out.println(Integer.parseInt("14",16));
		System.out.println(Integer.parseInt("13"));
		System.out.println(Integer.parseInt("13",10));
		System.out.println(Integer.parseInt("13",16));
		System.out.println(Integer.parseInt("23",16));
//		16 is radix, 1,2 ..10 then abcdef, so 13 is 1*16 + 3 -> 20, 23 -> 2*16+3 that is 35

	}

}
