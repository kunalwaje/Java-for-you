package array;
import java.util.Scanner;

public class SHL {	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size :");
		int a[]=new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(sum(a[i]));
		}
	}
	public static int  sum(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		
		return sum;
	}

}
