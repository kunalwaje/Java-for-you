import java.util.Scanner;

public class SumFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        int den = 1, sum = 0;
        while (den <= num) {
            if (num % den == 0) {
                System.out.println(den);
                sum = sum + den;
            }
            den++;
        }

        System.out.println("Sum of Factors are : " + sum);
    }

}
