package assignments;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		String s2[]=s.split(" ");
		for (int i =s2.length-1;i>=0; i--) { //k,u,n,a,l
			reverse(s2[i]);
		}
	}
	public static void reverse(String s)
	{
		char s1[]=s.toCharArray();
		for (int i =s1.length-1;i>=0; i--) {
			System.out.print(s1[i]);
		}
		System.out.print(" ");
		
	}
	
}
