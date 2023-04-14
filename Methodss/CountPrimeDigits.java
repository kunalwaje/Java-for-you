import java.util.Scanner;

class CountPrimeDigits {
    public static boolean checkPrime(int num) {
        if (num == 1) {
            return false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int countPrime(int num) {
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            boolean ans = checkPrime(rem);
            if (ans) {
                count++;
            }
            num /= 0;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int ip = sc.nextInt();
        System.out.println(countPrime(ip));
    }
}
