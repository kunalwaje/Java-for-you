package array;

import java.util.Scanner;

public class SearchIndex {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size of an array :");
		int a[]=new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter Index:");
		int index=sc.nextInt();
		if(index<a.length)
		{
			System.out.println(a[index]);
		}
		else
		{
			System.out.println("Index not found");
		}
	
		
	}
}
