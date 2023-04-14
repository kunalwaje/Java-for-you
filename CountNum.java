import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            int count = 0;
            System.out.println("Enter Number");
            int num = sc.nextInt();
            for (num = num; num > 0; num /= 10) {
                count = count + 1;

            }
            System.out.println(count);

        }
    }
}