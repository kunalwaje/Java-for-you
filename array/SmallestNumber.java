package array;

import java.util.Scanner;

public class SmallestNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size :");
		int arr[]=new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		int min=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(min<arr[i])
			{
				min=arr[i];
			}
		}
		
		
		System.out.println(min+" is the smallest value in an array");
	}

}
