package Oops.src;

class BottoleDriver {
    public static void main(String[] args) {
        Bottole b1 = new Bottole();

        //, b1.brand = "abc";
        b1.cap = 1.5;
        b1.type = "plastic";
        b1.price = 20.0;

        b1.displayBottole();
    }
}