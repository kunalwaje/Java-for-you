import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        int count = 0, n1 = 0, n2 = 1, n3;
        while (count < num) {
            n3 = n1 + n2;
            System.out.println(n1);
            n1 = n2;
            n2 = n3;
            count++;
        }
    }
}