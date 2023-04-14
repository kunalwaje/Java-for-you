import java.util.Scanner;

public class ForReverse {
    public static void main(String[] args) {
        int reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        for (num = num; num > 0; num /= 10) {
            int rem = num % 10;
            reverse = (reverse * 10) + rem;

        }
        System.out.println("Reverse Number Is  " + reverse);
    }

}
