package array;
import java.util.Scanner;
public class DiffrenceLargestSmallest {
		public static void main(String[] args) {
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter Size of an array:");
			int a[]=new int[sc.nextInt()];
			for (int i = 0; i < a.length; i++) {
				a[i]=sc.nextInt();
			}
			int max=a[0];
			for (int i = 1; i < a.length; i++) {
				if(max<a[i])
				{
					max=a[i];
				}
			}
			int min=a[0];
			for (int i = 0; i < a.length; i++) {
				if(min>a[i])
				{
					min=a[i];
				}
			}
			int diff=max-min;
			System.out.println(diff);
		}
}
