import java.util.Scanner;

public class ProductFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        int den = 1, prod = 1;
        while (den <= num) {
            if (num % den == 0) {
                System.out.println(den);
                prod = prod * den;
            }
            den++;
        }
        System.out.println("Product of given factors are : " + prod);
    }

}
