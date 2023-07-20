package array;
import java.util.Scanner;
public class ArrayCharToAscii {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of an array :");;
		char a[]=new char[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter Value in "+i+"block");
		}
	}

}
