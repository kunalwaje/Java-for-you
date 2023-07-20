package Oops.src;

class BagDriver {
	public static void main(String[] args) {
		Bag b1 = new Bag();
		b1.brand = "Skybag";
		b1.color = "Blue";
		b1.type = "Trekking";
		b1.price = 2500.0;
		b1.litre = 65;
		b1.compartment = 7;
		b1.waterproof = true;

		b1.displayBag();

		System.out.println("================================");

		Bag b2 = new Bag();
		b2.brand = "American Tourister";
		b2.color = "Grey";
		b2.type = "Travlling";
		b2.price = 6000.0;
		b2.litre = 95;
		b2.compartment = 3;
		b2.waterproof = true;

		b2.displayBag();

		System.out.println("================================");

		Bag b3 = new Bag();
		b3.brand = "Puma";
		b3.color = "Black";
		b3.type = "Backpack";
		b3.price = 1000.0;
		b3.litre = 20;
		b3.compartment = 3;
		b3.waterproof = false;

		b3.displayBag();
	}
}
