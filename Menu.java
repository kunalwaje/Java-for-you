import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice, mv1;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Veg");
        System.out.println("2. Non-Veg");

        System.out.println("Enter Your Choice ");
        choice = sc.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("Veg");
                break;
            }
            case 2: {
                System.out.println("Non-Veg");
                break;
            }

        }

    }

}