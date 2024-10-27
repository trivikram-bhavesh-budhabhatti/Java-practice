package edu.northeastern.csye6200;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lab4p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner fin = new Scanner (new File("integers.txt"))){
//			String firstline = fin.nextLine();
//			String secondline = fin.nextLine();
//			System.out.println(firstline);
			for ( int i =0; i<5;i++) {
			System.out.println(fin.nextInt());
			}
		}
		catch (FileNotFoundException ex) {
			System.out.println("file not found");
			System.exit(0);
		}
	}

}
