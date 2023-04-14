import java.util.Scanner;

class CheckFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        int n1 = 0, n2 = 1, n3;
        while (true) {
            n3 = n1 + n2;
            if (n1 == num) {
                System.out.println("It is A fibonacci number ");
                break;
            } else if (n1 < num) {
                continue;
                System.out.println("Not a fibonacci");
            }
            n1 = n2;
            n2 = n3;
        }
    }
}