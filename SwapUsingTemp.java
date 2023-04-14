import java.util.Scanner;

public class SwapUsingTemp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number a : ");
        int a = scanner.nextInt();

        System.out.println("Enter number b : ");
        int b = scanner.nextInt();

        System.out.println("Before swapping a = " + a + " b = " + b);

        // Swapping number
        int c = a;

        a = b;
        b = c;

        System.out.println("After swapping a = " + a + " b = " + b);

    }
}