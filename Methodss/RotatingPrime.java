package Methodss;

import java.util.Scanner;

public class RotatingPrime {
    public static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int count(int num) {
        int ct = 0;
        while (num != 0) {
            ct++;
            num /= 10;
        }
        return ct++;
    }

    public static int rotate(int num) {

        return (num % 10 * power(10, count(num) - 1)) + (num / 10);
    }

    public static int power(int base, int raise) {
        int pow = 1;
        for (int i = 0; i < raise; i++) {
            pow *= base;
        }
        return pow;
    }

    public static boolean checkRotatingPrime(int num) {
        int temp = num;
        while (isPrime(num)) {
            num = rotate(num);
            if (temp == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting Number :");
        int start = sc.nextInt();
        System.out.println("Enter End Number :");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            if (checkRotatingPrime(i)) {
                System.out.println(i);
            }
        }
    }

}
