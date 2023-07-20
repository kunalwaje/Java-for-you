package array;

import java.util.Iterator;
import java.util.Scanner;

public class SearchElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size : ");
		int [] a=new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter number to be search :"); 
		int num=sc.nextInt();
		
		for (int i = 0; i < a.length; i++) {
			if(isSearch(a[i]==num))
			{
				System.out.println("Element found = "+a[i]);	
			}
			else
			{
				System.out.println("Not found = "+a[i]);	
			}
		}
	}
	public static boolean isSearch(int num)
	{
		int temp=num;
		for (int i = 0; i < num; i++) {
			if(temp==num)
			{
				//System.out.println("Element found = "+a[i]);	
				return true;
			}	
			
		}
		return false;
	}

}
