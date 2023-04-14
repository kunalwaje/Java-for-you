import java.util.Scanner;

class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount in Rupee : ");
        double inr = sc.nextDouble();
        rupeeToDollar(inr);
    }

    public static void rupeeToDollar(double rupee) {
        double dollar = rupee / 82.31;
        int temp = (int) ((dollar * 100) / 100.0);
        System.out.println(temp);
        dollarToEuro(temp);
    }

    public static void dollarToEuro(double dollar) {
        double euro = dollar * 0.92;
        int temp = (int) ((euro * 100) / 100.0);
        System.out.println(temp);
        euroToDhiram(temp);
    }

    public static void euroToDhiram(double euro) {
        double dhiram = euro * 3.98;
        int temp = (int) ((dhiram * 100) / 100.0);
        System.out.println(temp);
        dhiramToPound(temp);
    }

    public static void dhiramToPound(double dhiram) {
        double pound = dhiram * 0.22;
        int temp = (int) ((pound * 100) / 100.0);
        System.out.println(temp);
        dollarToEuro(temp);
    }

}
