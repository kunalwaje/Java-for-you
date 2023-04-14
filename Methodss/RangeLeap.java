package Methodss;

import java.util.Scanner;

class RangeLeap {
    public static boolean checkLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start Year :");
        int start = sc.nextInt();
        System.out.println("Enter Ending Year :");
        int end = sc.nextInt();
        for (int i = 0; i <= end; i++) {
            if (checkLeap(i)) {
                System.out.println(i);
            }
        }
    }
}