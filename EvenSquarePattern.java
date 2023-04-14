public class EvenSquarePattern {
    public static void main(String[] args) {
        int n = 4; // Number of rows and columns
        int num = 2; // Starting even number

        // Loop through each row
        for (int i = 1; i <= 5; i++) {

            // Loop through each column in the row
            for (int j = 1; j <= 4; j++) {

                // Print the current even number and a space
                System.out.print(num + " ");

                // Increment the even number by 2
                num += 2;
                
            }

            // Move to the next row
            System.out.println();
        }
    }
}
