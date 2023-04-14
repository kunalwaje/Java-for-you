package Methodss;

import java.util.Scanner;

class RotateNumber {
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

    public static int rotate(int num) {
        int ct = count(num);
        int position = power(10, ct - 1);
        int last = num % 10;
        num /= 10;
        int ans = (last * position) + num;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int ip = sc.nextInt();
        System.out.println(rotate(ip));
    }
}