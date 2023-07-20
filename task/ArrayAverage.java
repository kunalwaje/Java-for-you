package task;

import java.util.Scanner;

public class ArrayAverage {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size of an array :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(avg(arr));
		
	}
	public static int avg(int arr[])
	{
		int avg;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		avg=(sum)/arr.length;
		return avg;
	}
	

}
