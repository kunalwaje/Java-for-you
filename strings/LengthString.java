package strings;

import java.util.Scanner;

public class LengthString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size");
		String[] s1=new String[sc.nextInt()];
		for (int i = 0; i < s1.length; i++) {
			System.out.println("Enter data in "+i+"th block of memory");
			s1[i]=sc.nextLine();
			s1[i]=sc.nextLine();
		}
		for (int i = 0; i < s1.length; i++) {
			String a=s1[i];
			System.out.println("Length of"+a+" = "+a.length());
		}
	}

}
