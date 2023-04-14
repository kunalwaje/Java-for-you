import java.util.Scanner;

public class DoWhile3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting Alphabet :");
        char start = sc.next().charAt(0);
        System.out.println("Enter Ending Alphabet :");
        char end = sc.next().charAt(0);
        do {
            if (start % 2 == 0) {
                System.out.println(start);
            }
            start++;
        } while (start <= end);

    }

}
