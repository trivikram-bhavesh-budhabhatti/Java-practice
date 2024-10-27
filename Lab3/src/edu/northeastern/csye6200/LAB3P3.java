package edu.northeastern.csye6200;

import java.util.Scanner;

public class LAB3P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,11,-30,46,11,9,-77,3,11};
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to search: ");
		int input_value = input.nextInt();
		int res=searchArray(arr, input_value);
		if (res == -1) {
			System.out.print("number not found in array");
		}
		else {
			System.out.print("index at"+res);
		}
		
	}
	public static int searchArray(int[] a, int search) {
		int index=-1;
		for(int i =0; i<a.length;i++) {
			if(search==a[i]){
				return i;
			}
		}
		return index;
	}

}
