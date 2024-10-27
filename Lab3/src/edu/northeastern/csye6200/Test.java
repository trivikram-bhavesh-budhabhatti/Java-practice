package edu.northeastern.csye6200;
import java.util.Date;

public class Test {
//	int x;
//	public Test(String t) {
//		System.out.println("Test");
//	}
	public static void main(String[]args) {
		Date[] dates = new Date[10];
		for(int i =0; i<10;i++)
			dates[i]=new Date();
		System.out.println(dates[0]);
		System.out.println(dates[0].toString());
	}

//	public static void main(String[]args) {
//		Test test = new Test();
//		System.out.println(test.x);
//	}
}
