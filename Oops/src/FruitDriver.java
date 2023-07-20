package Oops.src;

public class FruitDriver {
    public static void main(String[] args) {
        Fruit f1 = new Fruit();

        f1.name = "Mango";
        f1.price = 500.00;
        f1.color = "Yellow";
        f1.origin = "Ratnagiri";
        f1.taste = "Sweet";

        f1.displayName().displayPrice().displayColor().displayOrigin().displayTaste();

        System.out.println("***********************************");

        Fruit f2 = new Fruit();

        f2.name = "Orange";
        f2.price = 40.00;
        f2.color = "Orange";
        f2.origin = "Nagpur";
        f2.taste = "Sweet & Sour";

        f2.displayName().displayPrice().displayColor().displayOrigin().displayTaste();
    }

}
