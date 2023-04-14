import java.util.Scanner;

public class Multipication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 1;
        System.out.println("Enter Number :");
        int n = sc.nextInt();
        while (start < 11) {
            System.out.println(+n + " * " + start + " = " + (start * n));
            start++;
        }
    }

}
