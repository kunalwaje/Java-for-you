import java.util.Scanner;

public class DoExtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        do {
            int rem = num % 10;
            System.out.println(rem);
            num = num / 10;
        } while (num > 0);
    }

}
