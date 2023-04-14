package Methodss;

import java.util.Scanner;

public class BouncyRange {
    public static boolean isBouncy(int num) {
        boolean inc = false, dec = false;
        while (num > 0) {
            int n1 = num % 10;
            num /= 10;
            int n2 = num % 10;
            // num /= 10;
            if (num == 0) {
                break;
            }
            if (n1 > n2) {
                dec = true;
            } else if (n1 < n2) {
                inc = true;
            }
            if (inc == true && dec == true) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start Number : ");
        int start = sc.nextInt();
        System.out.println("Enter end Number : ");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            if (isBouncy(i)) {
                System.out.println("Bouncy number is " + i);
            }
        }
    }

}
