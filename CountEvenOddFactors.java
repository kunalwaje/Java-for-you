import java.util.Scanner;

public class CountEvenOddFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        int den = 1, sum1 = 0, sum2 = 0, cteven = 0, ctodd = 0;
        while (den <= num) {
            if (num % den == 0) {
                if (den % 2 == 0) {
                    sum1 = sum1 + den;
                    cteven++;
                } else {
                    sum2 = sum2 + den;
                    ctodd++;
                }

            }
            den++;
        }
        System.out.println("count of even factors are : " + cteven);
        System.out.println("count of odd factors are :" + ctodd);
        if (cteven > ctodd) {
            System.out.println("Even count is more");
        } else {
            System.out.println("Odd count is more");
        }
    }

}
