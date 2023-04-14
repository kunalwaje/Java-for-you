import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                sum1 = sum1 + rem;
                num /= 10;

            } else {
                sum2 = sum2 + rem;
                num /= 10;
            }

        }
        System.out.println("Sum Of Even Number in the Digit is " + sum1);
        System.out.println("Sum Of Odd Number in the Digit is " + sum2);
    }

}
