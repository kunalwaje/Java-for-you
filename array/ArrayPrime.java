package array;

import java.util.Scanner;

public class ArrayPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size : ");
		int [] a=new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (isPrime (a[i])) {
				System.out.println("Prime number ="+a[i]);
			}
		}
	}
	public static boolean isPrime(int num)
	{
		if(num==1)
			return false;
	
		for (int i = 2; i < num; i++) {
			if(num%i==0)
			
				return false;	
		}
		return true;
	
	}

}
