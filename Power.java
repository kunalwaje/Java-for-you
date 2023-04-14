import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base :");
        int base = sc.nextInt();
        System.out.println("Enter Raise :");
        int raise = sc.nextInt();
        int ans = 1;
        for (int i = 0; i < raise; i++) {
            ans = ans * base;
        }
        System.out.println("Power of " + base + " raise to " + raise + " is " + ans);

    }

}
