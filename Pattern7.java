public class Pattern7 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0 || i == 9 || i == j) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }

            System.out.println();

        }

    }

}
