package encapsulation;
public class Account 
	 {
		private String bank;
		private String ifsc;
		private String branch;
		private long accno;
		private String name;
		private double balance;
		private int pin;
		private String type;
		private long phno;
		public Account()
		{
			
		}
		public Account(String bank, String ifsc, String branch, long accno, String name, double balance, int pin,
				String type, long phno) {
			super();
			this.bank = bank;
			this.ifsc = ifsc;
			this.branch = branch;
			this.accno = accno;
			this.name = name;
			this.balance = balance;
			this.pin = pin;
			this.type = type;
			this.phno = phno;
		}
		public String getBank() {
			return bank;
		}
		public String getIfsc() {
			return ifsc;
		}
		public String getBranch() {
			return branch;
		}
		public long getAccno() {
			return accno;
		}
		public String getName() {
			return name;
		}
		public double getBalance(long accno, int pin) {
			if (this.accno==accno && this.pin==pin) {
				return balance;
				
			} else {
				System.out.println("Invalid Credentials");
				return 0;
			}	
		}
		public void withdraw(double amount, long accno,int pin)
		{
			if(accno==this.accno && pin==this.pin)
			{
				if(amount>0 && (balance-amount>=2000))
				{
					balance-=amount;
					System.out.println("Amount Debited");
					System.out.println("Your balance = "+balance);
				}
				else
				{
					System.out.println("Insufficient balance!!");
				}
			}
			else
			{
				System.out.println("Invalid Credentails");
			}
		}
		public void deposit(long accno,int pin,double amount)
		{
			if(accno==this.accno && pin==this.pin)
			{
				if(amount>0)
				{
					balance+=amount;
					System.out.println("Amount Credited ");
					System.out.println("Your Balance = "+balance);
				}
				else
				{
					System.out.println("Invalid amount");
				}
			}
			else 
			{
				System.out.println("Invalid Credentials");
			}			
		}
		public void setPin(long accno,int oldpin,int newpin ) {
			if(accno==this.accno && oldpin==this.pin)
			{
				pin=newpin;
				System.out.println("Pin Changed Successfully");
			}
			else
			{
				System.out.println("Invalid Credentials");
			}	
		}

		public String getType() {
			return type;
		}


		public long getPhno() {
			return phno;
		}	
}
	
	
	


