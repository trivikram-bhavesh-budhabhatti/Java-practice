package edu.northeastern.csye6200;

import java.util.Arrays;

public class Lecture10E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(comparearr("hello","ehllo"));

}
public static boolean comparearr(String s1, String s2) {
//	String s1 = "hello";
//	String s2 = "elolh";
	int n1 = s1.length();
	int n2 = s2.length();
	char[] ch1 = s1.toCharArray();
	char[] ch2 = s2.toCharArray();
	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	for ( int i = 0; i < s1.length(); i++) {
		if (ch1[i] != ch2[i]) {
			return false;
		}
	}
	return true;
}
}