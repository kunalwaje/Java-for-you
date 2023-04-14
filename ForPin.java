import java.util.Scanner;

public class ForPin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempt = 0;
        int actpin = 1234;

        for (attempt = 0; attempt < 3; attempt++) {
            System.out.println("Enter Your Pin");
            int pin = sc.nextInt();
            if (pin == actpin) {
                System.out.println("Login Sucessful!!!");
                break;

            }
            System.out.println("Incorrect Pin!!!!");

        }
        if (attempt == 3) {
            System.out.println("Maximum attempt Reached!! Sorrryyy!!!!! Try again!!");
        }
        
    }

}
