import java.util.Scanner;

public class Buzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        int num = sc.nextInt();
        {
            if (num % 10 == 0 || num % 7 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("Not Buzz");
            }
        }
    }
}