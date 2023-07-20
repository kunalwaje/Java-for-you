package assignments;
import java.util.Scanner;
public class PrintUcLcNumberSymbols {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String ");
		String s1= sc.nextLine();
		//char ch1[]=s1.toCharArray();
		System.out.println("upper case :");
		for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                System.out.print(ch + " ");
            }
		}
		System.out.println("lowercase :");
		for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                System.out.println(ch + " ");
            }
		}
		System.out.println("Numbers :");
		for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch >= '0' && ch <= '9') {
                System.out.println(ch + " ");
            }
		}
	}
}
