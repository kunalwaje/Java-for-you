import java.util.Scanner;

public class Spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        int sum = 0, prod = 1;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            prod = prod * rem;
            num /= 10;
        }
        if (sum == prod) {
            System.out.println("It is Spy Number ");
        } else {
            System.out.println("Not a spy number :");
        }
    }
}