package array;

import java.util.Scanner;

public class BiggestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size :");
		int arr[]=new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max+" is the biggest value in an array");
	}
}
