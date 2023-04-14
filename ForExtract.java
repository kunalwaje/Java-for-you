import java.util.Scanner;

public class ForExtract {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        for (num=num; num > 0; num = num/10 )  
        {
            int rem = num % 10;
            System.out.println(rem);
        }
    }
}
