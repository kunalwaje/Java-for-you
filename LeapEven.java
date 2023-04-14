import java.util.Scanner;

public class LeapEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start Year :");
        int start = sc.nextInt();
        System.out.println("Enter Ending Year :");
        int end = sc.nextInt();
        for (start = start; start <= end; start++) {
            if (start % 2 == 0) {
                if ((start % 4 == 0) && start % 100 != 0 || (start % 400 == 0)) {
                    System.out.println("It is leap year:" + start);
                } else {
                    // System.out.println("It is not leap year" + start);
                }
            }
        }
    }

}
