import java.util.Scanner;

public class Happy {
    public static int isHappy(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += (rem * rem);
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int ip = sc.nextInt();
        while (true) {
            ip = isHappy(ip);
            if (ip == 1 || ip == 4) {
                break;
            }

        }
        if (ip == 1) {
            System.out.println("It is Happy Number");
        } else {
            System.out.println("It is Unhappy Number");
        }
    }

}
