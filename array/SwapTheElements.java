package array;

import java.util.Scanner;

public class SwapTheElements {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size of an array ;");
		int [] a=new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
	    int temp;
		for(int i=0;i<a.length-1;i+=2)
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				//i++;
				//System.out.println(a[i]);
				
			}
			
		for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		
		
		
	}

}
