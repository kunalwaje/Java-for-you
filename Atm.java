public class Atm {
    public static void main(String[] args) {
        int transac = 9;
        switch (transac) {
            case 1:
                System.out.println("Balance Enquiry");
                break;

            case 2:
                System.out.println("Fast Cash");
                break;

            case 3:
                System.out.println("Mini Statement");
                break;

            case 4:
                System.out.println("Cash WithDrawl");
                break;

            case 5:
                System.out.println("Deposit");
                break;

            case 6:
                System.out.println("Pin Change");

            default:
                System.out.println("Invalid Input");
        }
    }
}