package assignments;

import java.util.Iterator;
import java.util.Scanner;

public class DuplicateString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String s1= sc.nextLine();
		char ch[]=s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count =0;
			if(ch[i]!='\u0000')
			{
				for (int j = i+1; j < ch.length; j++) {
					if(ch[i]==ch[j])
					{
						count++;
						ch[j]='\u0000';
						
					}
				}
				if(count!=0)
				{
					System.out.print(ch[i]);
				}
			}
		}
	}

}
