import java.util.Scanner;

public class Duck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        while (num > 0) {
            // int rem = num % 10;
            if (num % 10 == 0) {
                // break;
                System.out.println("Duck Number");
            }
            num /= 10;

        }

    }
}