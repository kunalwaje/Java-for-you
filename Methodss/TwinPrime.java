package Methodss;

import java.util.Scanner;

class TwinPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = s.nextInt();
        System.out.println("Enter second number");
        int n2 = s.nextInt();

        if (isTwinPrime(n1, n2)) {
            System.out.println("Numbers are twin prime");
        } else {
            System.out.println("Numbers are not twin prime");
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTwinPrime(int num1, int num2) {
        if (num1 - num2 == 2 || num2 - num1 == 2) {
            if (isPrime(num1) && isPrime(num2)) {
                return true;
            }
        }
        return false;
    }
}