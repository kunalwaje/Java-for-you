import java.util.Scanner;

public class PinVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempt = 0;
        int actpin = 1234;
        do {
            System.out.println("Enter Your Pin :");
            int pin = sc.nextInt();
            if (pin == actpin) {
                System.out.println("Login Sucess!");
                break;
            }
            System.out.println("Incorrect Pin");
            attempt++;
        } while (attempt < 3);
        if (attempt == 3) {
            System.out.println("Maximum Attempt Reached !!!");
        }
    }

}
