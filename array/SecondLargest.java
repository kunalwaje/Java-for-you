package array;
import java.util.Scanner;
public class SecondLargest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int a[]=new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int firstmax=a[0];
		int secondmax=a[0];
		for (int i = 0; i < a.length; i++) {
			{
				if(a[i]>firstmax)
				{
				}
				firstmax=a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]>secondmax && a[i]!=firstmax)
			{
				secondmax=a[i];
			}
		}
		System.out.println("Second Maximum ="+secondmax);
	}
}
