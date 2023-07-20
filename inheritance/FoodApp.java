package inheritance;

public class FoodApp {
	String name;
	String Founder;
	double net ;
	String industry;
	String origin;
	
	public FoodApp()
	{
		
	}

	public FoodApp(String name, String founder, double net, String industry, String origin) {
		super();
		this.name = name;
		Founder = founder;
		this.net = net;
		this.industry = industry;
		this.origin = origin;
	}
	
	public void displayFoodApp()
	{
		System.out.println("Name  : ");
		
	}
}
