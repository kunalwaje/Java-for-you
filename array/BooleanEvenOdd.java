package array;

import java.util.Scanner;

public class BooleanEvenOdd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size of an array :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		boolean b[]=evenOdd(arr);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
	}
	public static boolean[] evenOdd(int a[])
	{
		boolean b[]= new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			int num=a[i];
			int sum=0;
			while(num>0)
			{
				int rem=num%10;
				sum+=rem;
				num/=10;
			}
			if (sum%2==0) {
				b[i]=true;
			}
			else
			{
				b[i]=false;
			}
		}
		return b;
	}

}
