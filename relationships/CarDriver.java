package relationships;

public class CarDriver {
	public static void main(String[] args) {
		Car c1=new Car("Tata", "White",1000000.00 , "Sedan","Petrol" , 6);
		c1.displayCar();
		c1.e1.displayEngine();
	}

}
