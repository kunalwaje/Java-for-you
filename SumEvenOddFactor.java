
import java.util.Scanner;

public class SumEvenOddFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        int den = 1, sum1 = 0, sum2 = 0;
        while (den <= num) {
            if (num % den == 0) {
                if (den % 2 == 0) {
                    sum1 = sum1+ den;
                } else { 
                    sum2 = sum2 + den;
                }

            }
            den++;
        }
        System.out.println("sum of even factors are : " + sum1);
        System.out.println("sum of odd factors are :" + sum2);
    }
}
