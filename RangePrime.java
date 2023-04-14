import java.util.Scanner;

public class RangePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting Number :");
        int start = sc.nextInt();
        System.out.println("Enter Ending Number :");
        int end = sc.nextInt();
        int j;
        System.out.println("Range of prime number from " + start + " to " + end);

        for (int i = start; i <= end; i++) {

            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }

            }
            if (i == j) {
                System.out.println(i);
            }

        }

    }

}
