package edu.northeastern.csye6200;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lecture13E2 {
	public static void main(String [] args) {
		ArrayList<Integer> list= new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a non integer to stop execution");
		while (input.hasNextInt()) {
			int inp_temp = input.nextInt();
			if (!list.contains(inp_temp)) {
				list.add(inp_temp);		
			}
		}
		Collections.sort(list);

		for ( Integer i : list) {
			System.out.println(i+" ");

		}
	}
}
