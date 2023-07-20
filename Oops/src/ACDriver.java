package Oops.src;

class ACDriver {
	public static void main(String[] args) {
		AC a1 = new AC();
		a1.brand = "Voltas";
		a1.price = 30000;
		a1.model = 4356;
		a1.ton = 1.5;
		a1.type = "Domestic";
		a1.maxtemp = 27;
		a1.mintemp = 16;
		a1.ambient = 23;
		a1.star = 3;

		a1.displayAC();

	}
}
