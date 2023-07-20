package encapsulation;

public class AccountDriver {
	public static void main(String[] args) {
		Account a1=new Account("ICICI Bank", "ICUC121", "Sinhagad Road", 123456789l, "Kunal Waje", 500000.00, 1234, "Savings", 9657708101l);
		{	
			
			System.out.println(a1.getBalance(123456789l, 1234));
			System.out.println(a1.getBank());
			a1.withdraw(50000.00, 123456789l, 1234);
			a1.setPin(123456789l, 1234, 2134);
			a1.deposit(123456789l, 2134, 500000.00);
			//System.out.println(a1.getBalance(123456789l, 2134));
		}
	}

}
