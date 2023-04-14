public class Lift {
    public static void main(String[] args) {
        char a = 'g';
        switch (a) {
            case 1:
                System.out.println("First Floor");
                break;
            case 2:
                System.out.println("Second  Floor");
                break;
            case 3:
                System.out.println("Third Floor");
                break;
            case 'g':
                System.out.println("Ground Floor");
                break;
            default:
                System.out.println("Invalid Number");
                break;
        }
    }
}