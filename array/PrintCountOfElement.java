package array;

import java.util.Scanner;

public class PrintCountOfElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int a[]=new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			int count =1;
			if(a[i]!=0)
			{
				for(int  j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
		
						count++;
						a[j]=0;
					}
				}
				for (int j=0;j<count;j++)
				{
					System.out.print(a[i]+" ");
				}
			}
			
		}

	}

}
