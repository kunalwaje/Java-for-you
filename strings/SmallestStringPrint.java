package strings;

import java.util.Scanner;

public class SmallestStringPrint {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String :");
		String s1=sc.nextLine();
		String [] s2=s1.split(" ");
		int max=1;
		for (int i = 0; i < s2.length; i++) {
			if(max>s2[i].length())
			{
				max=s2[i].length();
				
			}
		}
		for (int i = 0; i < s2.length; i++) {
			if(s2[i].length()==max)
			{
				System.out.println(s2[i]);
			}
		}
	}

}
