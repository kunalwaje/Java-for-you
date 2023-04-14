import java.util.Scanner;

class MCheckSumEvenOdd {
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + (num % 10);
            num /= 10;
        }
        return sum;
    }

    public static boolean checkEvenOddd(int num) {
        if (num % 2 == 0) {
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int ip = sc.nextInt();
        int sum = sumOfDigits(ip);
        boolean ans = checkEvenOddd(sum);
        if (ans) {
            System.out.println("Sum of digits is even");
        } else {
            System.out.println("Sum of digits is Odd");
        }

    }

}