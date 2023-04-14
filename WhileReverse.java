import java.util.Scanner;

public class WhileReverse {
    public static void main(String[] args) {

        int reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        while (num > 0) {
            int rem = num % 10;
            reverse = (reverse * 10) + rem;
            num /= 10;
        }
        System.out.println("Reverse Number Is  " + reverse);
    }

}
