import java.util.Scanner;

class LengthConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value in Kilo-meter : ");
        double num = sc.nextDouble();
        kmToM(num);
    }

    public static void kmToM(double m) {
        double meter = m * 1000;
        int temp = (int) (meter * 100);
        System.out.println("Meter : " + temp / 100.0);
        meterToCm(temp / 100.0);
    }

    public static void meterToCm(double centi) {
        double cm = centi * 100;
        int temp = (int) (cm * 100);
        System.out.println("Centimeter : " + temp / 100.0);
        cmToMm(temp / 1000.0);

    }

    public static void cmToMm(double milli) {
        double mm = milli * 10;
        int temp = (int) (mm * 100);
        System.out.println("millimeter :" + temp / 100.0);
        mmToFeet(temp / 100.0);
    }

    public static void mmToFeet(double feet) {
        double ft = feet / 30.48;
        int temp = (int) (ft * 100);
        System.out.println("Feet : " + temp / 100.0);
    }

}