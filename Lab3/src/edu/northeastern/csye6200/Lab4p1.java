package edu.northeastern.csye6200;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab4p1 {
	public static void main(String[] args) {
		try (Scanner fin = new Scanner (new File("test.txt"))){
			String firstline = fin.nextLine();
			String secondline = fin.nextLine();
			System.out.println(firstline);
			System.out.println(secondline);
		}
		catch (FileNotFoundException ex) {
			System.out.println("file not found");
			System.exit(0);
		}
	}
}
