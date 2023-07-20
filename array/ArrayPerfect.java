package array;

import java.util.Scanner;

public class ArrayPerfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size of an array ;");
		int [] a=new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (isPerfect(a[i])) {
				System.out.println("Perfect Number is :"+a[i]);
			}
		}
	}
	public static boolean isPerfect(int num)
	{
		int sum=0;
		for (int i = 0; i < num; i++) {
			
		}
		return false;
	}

}
