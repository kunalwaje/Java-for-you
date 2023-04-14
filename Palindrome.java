import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        int reverse = 0;
        while (num > 0) {
            int rem = num % 10;
            reverse = (reverse * 10) + rem;
            num /= 10;
        }

        if (num == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}