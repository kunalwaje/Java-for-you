package array;

import java.util.Scanner;

public class DuplicateElements {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size of an array :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			int count=0;
			if(arr[i]!=0)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						arr[j]=0;
					}
				}//end of inner loop
				if(count!=0)
				{
					System.out.println(arr[i]);
				}
			}//end of if condition
		}//end of outer for loop   

	}

}
