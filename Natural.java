import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting Number: ");
        int start = sc.nextInt();
        System.out.println("Enter End Number");
        int end = sc.nextInt();

        // int start = 1;
        int sum = 0;
        while (start <= end) {
            System.out.println("Sum = " + (sum = sum + start));
            start++;
        }

    }

}
