package array;
import java.util.Scanner;
public class Shift {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size of an array:");
		int a[]=new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			//System.out.println(a[i]);
		}
		System.out.println("Enter the postion to swap:");
		int swap=sc.nextInt();
		
		
	}
}
