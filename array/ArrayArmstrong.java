package array;

import java.util.Scanner;

public class ArrayArmstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size : ");
		int [] a=new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (isArmStrong(a[i])) {
				System.out.println("Armstrong ="+a[i]);
			}
		}
	}
	 public static int count(int num) {
	        int ct = 0;
	        while (num != 0) {
	            ct++;
	            num /= 10;
	        }
	        return ct++;
	    }

	    public static int power(int base, int raise) {
	        int pow = 1;
	        for (int i = 0; i < raise; i++) {
	            pow *= base;
	        }
	        return pow;
	    }

	    public static boolean isArmStrong(int num) {
	        int temp = num;
	        int ct = count(num);
	        int sum = 0;
	        while (num != 0) {
	            int rem = num % 10;
	            sum = sum + power(rem, ct);
	            num /= 10;
	        }
	        if (temp == sum) {
	            return true;
	        } else {
	            return false;
	        }

	    }
}
