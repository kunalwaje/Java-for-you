import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number  :");
        int n = sc.nextInt();
        int square = n * n;
        while (square != 0) {
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;

        }
        // System.out.println(sum);
        if (n == sum) {
            System.out.println("It is a neon number");
        } else {
            System.out.println("Not a neon number");
        }
    }
}