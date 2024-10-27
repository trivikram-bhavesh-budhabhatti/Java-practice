package edu.northeastern.csye6200;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class lab4p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (PrintWriter fout = new PrintWriter(new File("numbers.txt"))) {
			for (int i = 1; i <= 100; i++) {
			fout.println(i);
			}
			}
			catch (FileNotFoundException ex) {
			System.out.println("File numbers.txt not found!");
			System.exit(0);
			}
	}

}
