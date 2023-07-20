package relationships;

public class Engine {
	int cc;
	int weight;
	int cylinder;
	int stroke;
	int bhp;
	
	public Engine() {
		
		// TODO Auto-generated constructor stub
	}

	public Engine(int cc, int weight, int cylinder, int stroke, int bhp) {
		//super();
		this.cc = cc;
		this.weight = weight;
		this.cylinder = cylinder;
		this.stroke = stroke;
		this.bhp = bhp;
	}
	
	public void displayEngine()
	{
		System.out.println("CC= "+cc);
		System.out.println("Weight= "+weight);
		System.out.println("Cylinder= "+cylinder);
		System.out.println("stroke= "+stroke);
		System.out.println("BHP= "+bhp);
	}
}
	
	

