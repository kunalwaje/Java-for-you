import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        int den = 2;
        while (den < num) {
            if (num % den == 0) {
                break;
            }
            den++;
        }
        if (num == den) {
            System.out.println("It  is Prime Number");
        } else {
            System.out.println("It is not Prime Number ");
        }
    }

}
