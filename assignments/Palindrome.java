package assignments;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		String s2[]=s.split(" ");
		for (int i =s2.length-1;i>=0; i--) {
			reverse(s2[i]);
		}
	}
	public static void reverse(String s)
	{
		String s2="";
		char s1[]=s.toCharArray();
		for (int i =s1.length-1;i>=0; i--) {
			//System.out.print(s1[i]);
			s2=s1[i]+s2;
		}
		if (s.equals(s2)) {
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		
	}
	
}
