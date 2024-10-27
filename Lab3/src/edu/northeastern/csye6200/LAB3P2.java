package edu.northeastern.csye6200;

public class LAB3P2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int[] arr = new int[10];
//		System.out.println(""+addOne(arr[]));
		arr=addOne(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		} 
	}
	public static int[] addOne(int[] a) {
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]+1; // or a[i]++;
		}
		return a;
	}
}
