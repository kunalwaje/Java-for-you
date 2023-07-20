package assignments;
import java.util.Scanner;
public class PrintOnlyConsonants {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String s1=sc.nextLine().toLowerCase();
		for (int i = 0; i < s1.length(); i++) {
			char ch=s1.charAt(i);
			if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
			{
				//System.out.print(ch+" ");
			}
			else
			{
				System.out.print(ch);
			}
			
			}
		}
	}


