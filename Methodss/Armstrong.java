import java.util.Scanner;

public class Armstrong {
    public static int count(int num) {
        int ct = 0;
        while (num != 0) {
            ct++;
            num /= 10;
        }
        return ct++;
    }

    public static int power(int base, int raise) {
        int pow = 1;
        for (int i = 0; i < raise; i++) {
            pow *= base;
        }
        return pow;
    }

    public static boolean isArmStrong(int num) {
        int temp = num;
        int ct = count(num);
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum + power(rem, ct);
            num /= 10;
        }
        if (temp == sum) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int ip = sc.nextInt();
        if (isArmStrong(ip)) {
            System.out.println("It is an ArmStrong Number ");
        } else {
            System.out.println("It is not an Armstrong Number");
        }
    }
}
