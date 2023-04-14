package Methodss;

import java.util.Scanner;

//import javax.naming.spi.ResolveResult;

class TwistedPrime {
    public static boolean checkPrime(int num) {
        if (num == 1) {
            return false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        int reverse = 1;
        while (num > 0) {
            int rem = num % 10;
            reverse = (reverse * 10) + rem;
            num /= 10;
        }
        if (checkPrime(num) == checkPrime(reverse)) {
            System.out.println("Twisted");
        } else {
            System.out.println("Not twisted");
        }

    }

}