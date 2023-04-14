package Methodss;

import java.util.Scanner;

public class RangeHappy {
    public static int isHappy(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += (rem * rem);
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Staring Number :");
        int start = sc.nextInt();
        System.out.println("Enter End Number :");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++)
            ;
        {
            while (end != 1 && start != 4) {
                start = isHappy(start);
            }
            if (end == 1) {
                System.out.println(start);
            }
        }

    }

}
