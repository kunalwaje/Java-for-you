package strings;
import java.util.Iterator;
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String 1 :");
		String s1=sc.next();
		System.out.println("Enter String 2 :");
		String s2=sc.next();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		int ct=0;
		if (ch1.length==ch2.length) {
			for (int i = 0; i < ch1.length; i++) {
				for (int j = 0; j < ch2.length; j++) {
					if (ch1[i]==ch2[j]) {
						ct++;
						ch1[j]='\u0000';
					}
					
				}	
			}
			if(ct==ch1.length)
			{
				System.out.println("It is an anagram");
			}
			else
			{
				System.out.println("It is not an anagram");
			}
			
		}
		
	}
	
}
