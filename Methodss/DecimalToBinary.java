package Methodss;

public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 10;

    }

    public static int Decimal(int num) {
        int rem;
        while (num > 0) {
            rem = num % 2;
            num /= 2;
        }
        return Decimal(num);
    }

    public static int reversee(int num) {
        int reverse;
        while (num > 0) {
            int rem = num % 10;
            reverse = (reverse * 10) + rem;
            num /= 10;
        }
        return reversee;
    }

}
