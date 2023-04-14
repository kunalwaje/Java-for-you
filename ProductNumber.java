import java.util.Scanner;

public class ProductNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int num = sc.nextInt();
        int pro = 1;
        while (num > 0) {
            int rem = num % 10;
            pro = pro * rem;
            num /= 10;
        }
        System.out.println("Sum of number is " + pro);
    }

}
