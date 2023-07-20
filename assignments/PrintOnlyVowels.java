package assignments;
import java.util.Scanner;
public class PrintOnlyVowels {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String :");
		String s1=sc.nextLine().toLowerCase();
		//char ch1[]=s1.toCharArray();
		//int count=0;
		for (int i = 0; i < s1.length(); i++) {
			char ch=s1.charAt(i);
			if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
			{
				System.out.print(ch+" ");
			}
			
		}
		//System.out.println(count);
	}
}
