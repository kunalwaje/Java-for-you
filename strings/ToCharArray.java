package strings;
import java.util.Scanner;
public class ToCharArray {
	public static void main(String[] args) {
		
		System.out.println("Enter String :");
		String s1 = new Scanner(System.in).next();
		char[] ch=toCharArray(s1);
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+" ");
			
		}
	}
	public static char[] toCharArray(String s1)
	{
		char[] ch=new char[s1.length()];
		for (int i = 0; i < s1.length(); i++) {
			ch[i]=s1.charAt(i);
		}
		return ch;
	}
}
