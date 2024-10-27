package edu.northeastern.csye6200;
import java.util.Scanner;

public class Lab1P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of yards:");
        int yards = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number of feet:");
        int feet = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number of inches:");
        int inches = Integer.parseInt(scanner.nextLine());
        scanner.close();
        yards=yards*3*12;
        feet=feet*12;
        int total=yards+feet+inches;
        System.out.println("Total inches: "+total);
    }
}