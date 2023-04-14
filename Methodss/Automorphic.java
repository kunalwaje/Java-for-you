package Methodss;

import java.util.Scanner;

class Automorphic {
    public static int count(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int power(int base, int raise) {
        int pow = 1;
        for (int i = 0; i < raise; i++) {
            pow = pow * base;
        }
        return pow;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = s.nextInt();
        int count = count(num);

        int position = power(10, count);
        int sqr = num * num;

        int ans = sqr % position;

        if (ans == num) {
            System.out.println("Number is automorphic");
        } else {
            System.out.println("Number is not an automorphic");
        }

    }
}