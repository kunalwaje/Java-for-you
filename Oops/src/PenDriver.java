package Oops.src;

public class PenDriver {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        System.out.println(p1.brand);
        System.out.println(p1.type);
        System.out.println(p1.price);
        System.out.println(p1.color);
        System.out.println(p1.thick);
        System.out.println("================================");

        p1.brand = "cello";
        p1.price = 10;
        p1.type = "Ball Point";
        p1.color = "Black";
        p1.thick = 0.5;
        System.out.println(p1.brand);
        System.out.println(p1.type);
        System.out.println(p1.price);
        System.out.println(p1.color);
        System.out.println(p1.thick);
        System.out.println("================================");

        Pen p2 = new Pen();
        p2.brand = "Reynolds";
        p2.price = 35;
        p2.type = "Gel";
        p2.color = "Blue";
        p2.thick = 0.7;

        System.out.println(p2.brand);
        System.out.println(p2.type);
        System.out.println(p2.price);
        System.out.println(p2.color);
        System.out.println(p2.thick);

    }

}
