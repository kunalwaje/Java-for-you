import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int evenct = 0;
        int oddct = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                sum1 = sum1 + rem;
                num /= 10;
                evenct++;

            } else {
                sum2 = sum2 + rem;
                num /= 10;
                oddct++;
            }

        }
        System.out.println("The Even digits present in the given number are " + evenct);
        System.out.println("The Odd digits present in the given number are  " + oddct);
    }

}
