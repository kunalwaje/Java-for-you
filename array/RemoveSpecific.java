package array;

import java.util.Scanner;

public class RemoveSpecific {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size :");
		int a[]=new int [sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter the index:");
		int index=sc.nextInt();
		if(index<a.length)
		{
			a[index]=0;
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
