package array;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of an array :");
		int size=sc.nextInt();
		int a[]=new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter values in "+i+" block");
			a[i]=sc.nextInt();
			System.out.println("[");
			for (int j = 0; j < a.length; j++) {
				
			}
		}
	}
}
