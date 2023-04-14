import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        int fact = 1;

        while (num > 0) {
            fact = fact * num;
            fact++;
        }
        System.out.println("Factorial of " + num + "  is " + fact);

    }

}
