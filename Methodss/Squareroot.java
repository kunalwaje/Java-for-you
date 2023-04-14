package Methodss;

public class Squareroot {
    public static double sqrt(double num) {
        int sq = 1;
        while (true) {
            if (sq * sq == num) {
                break;
            } else if (sq * sq < num) {
                sq++;
            } else if (sq * sq > num) {
                break;
            }
        }
        if (sq * sq == num) {
            return sq;
        } else {
            double after = (sq * sq) - num;
            double before = num - ((sq - 1) * (sq - 1));
            if (after < before) {
                return sq - (after / (2 * sq));
            } else {
                sq--;
                return sq + (before / (2 * sq));
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(sqrt(14));
    }

}
