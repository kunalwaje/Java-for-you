import java.util.Scanner;

public class OddAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting Alphabet :");
        char start = sc.next().charAt(0);
        System.out.print("Enter Ending Alphabet :");
        char end = sc.next().charAt(0);
        while (start <= end) {
            if (start % 2 == 0) {
                System.out.println("Alphabet :" + start);
            }
            start++;
        }
    }

}
