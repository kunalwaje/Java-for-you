import java.util.Scanner;

public class EvenFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        int den = 1;
        while (den <= num) {
            if (num % den == 0) {
                if (den % 2 == 0) {
                    System.out.println("It is even factors : " + den);
                } else {
                    System.out.println("It is odd factors : " + den);
                }

            }

            den++;
        }
    }
}
