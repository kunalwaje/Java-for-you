package array;
//Not Working
import java.util.Scanner;

public class ArrayPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size : ");
		int [] a=new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (isPalindrome (a[i])) {
				System.out.println("Palindrome ="+a[i]);
			}
		}
	}
	public static boolean isPalindrome(int num)
	{
		int reverse=0;
		while(num>0)
		{
			int rem = num % 10;
            reverse = (reverse * 10) + rem;
            num /= 10;
		}
		if (num==reverse) {
			return true;
		}
		
		return false;
	}

}
