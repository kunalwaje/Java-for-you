import java.util.Scanner;

public class ProductEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        int pro1 = 1;
        int pro2 = 1;
        while (num > 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                pro1 = pro1 * rem;
                num /= 10;

            } else {
                pro2 = pro2 * rem;
                num /= 10;
            }
        }
        System.out.println("The Product of even number in the digit is " + pro1);
        System.out.println("The Product of odd number in the digit is " + pro2);

    }

}
