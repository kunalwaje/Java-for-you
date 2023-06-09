package Methodss;

import java.util.Scanner;

class RotateNTime {
    public static int count(int num) {
        int ct = 0;
        while (num > 0) {
            ct++;
            num /= 10;
        }
        return ct;
    }

    public static int power(int base, int raise) {
        int pow = 1;
        for (int i = 0; i < raise; i++) {
            pow = pow * base;
        }
        return pow;
    }

    public static int rotate(int num, int ct) {
        for (int i = 0; i < ct; i++) {
            int count = count(num);
            int position = power(10, count - 1);
            int last = num % 10;
            num /= 10;
            int ans = (last * position) + num;
            System.out.println(ans);
            num = ans;

        }
        return num;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        int ip = s.nextInt();

        System.out.println("Enter Count");
        int count = s.nextInt();

        rotate(ip, count);
    }
}