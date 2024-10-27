package edu.northeastern.csye6200;

import java.util.Scanner;

public class LAB1P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Inches:");
        int inches = Integer.parseInt(scanner.nextLine());
        int yards = Math.round(inches/36);
        int feet = Math.round((inches - (yards*36))/12);
        int difinches = inches - ((yards*36) + (feet*12));
        System.out.println("y:"+yards+"f:"+feet+"i"+difinches);
	}

}
