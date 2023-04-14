import java.util.Scanner;

class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2 : ");
        int num2 = sc.nextInt();
        int hcf = num1 < num2 ? num1 : num2;
        while (true) {
            if (hcf % num1 == 0 && hcf % num2 == 0) {
                System.out.println("HCF is : " + hcf);
                break;
            }
            hcf--;
        }
    }
}