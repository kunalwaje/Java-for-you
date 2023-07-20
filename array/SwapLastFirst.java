package array;

import java.util.Scanner;

public class SwapLastFirst {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size :");
		int a[]=new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			
		}
		int temp=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
