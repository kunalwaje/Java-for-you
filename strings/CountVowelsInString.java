package strings;

import java.util.Scanner;

public class CountVowelsInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String s1=sc.nextLine().toLowerCase();
		char ch1[]=s1.toCharArray();
		int count=0;
		for (int i = 0; i < ch1.length; i++) {
			if(ch1[i]=='a' ||ch1[i]=='e' ||ch1[i]=='i' ||ch1[i]=='o' ||ch1[i]=='u')
			{
				count++;
			}
			
		}
		System.out.println(count);
	}
}
