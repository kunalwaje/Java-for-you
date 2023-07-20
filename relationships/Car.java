package relationships;

public class Car {
	String brand;
	String color;
	double price;
	String type;
	String fuel;
	Engine e1=new Engine(1200,10,4,4,10);
	int seats;
	
	public Car()
	{
		
	}

	public Car(String brand, String color, double price, String type, String fuel, int seats) {
		//super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.type = type;
		this.fuel=fuel;
		this.seats=seats;
	}
	public void displayCar()
	{
		System.out.println("Brand= "+brand);
		System.out.println("Price= "+price);
		System.out.println("Color= "+color);
		System.out.println("Fuel Type= "+fuel);
		System.out.println("Type= "+type);
		System.out.println("Number of Seats= "+seats);
		System.out.println("===============================");
	}
	
	
}
