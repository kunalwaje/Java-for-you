package revision;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeStore {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter Starting Number :");
		int num=sc.nextInt();
		int a[]=isPrime(num);
		System.err.println(Arrays.toString(a));
		
	}
	public static int[] isPrime(int num)
	{
		int ans[]=new int[5];
		int temp=num;
		int index=0;
		int i;
		while(true)
		{
			for ( i = 2; i < temp; i++) {
				if(temp%i==0)
				{
					break;
				}
			}
			if(i==temp)
			{
				ans[index++]=temp;
				
			}
			temp++;
			if(index==ans.length)
			{
				break;
			}
			
		}
		return ans;
	}

}
