package Methodss;

import java.util.Scanner;

class Ugly {
    public static boolean isUgly(int num) {
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 3 == 0) {
                num /= 3;
            } else if (num % 5 == 0) {
                num /= 5;
            } else {
                break;
            }
        }
        if (num == 1) {
            return true;
        } else {

            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        if (isUgly(sc.nextInt())) {
            System.out.println("It is Ugly Number");
        } else {
            System.out.println("It is Not Ugly");
        }
    }
}