
//To be Done
import java.util.Scanner;

public class PowerOfSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        System.out.println("Enter Raise :");
        int raise = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            int pow = 1;
            for (int i = 0; i < raise; i++) {
                pow *= rem;
            }
            sum += pow;
            num /= 10;
            System.out.println("Sum of power is : " + sum);
        }

    }
}