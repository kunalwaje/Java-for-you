package Oops.src;

class BikeDriver {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.name = "KTM Duke";
        b1.cc = 390;
        b1.type = "Petrol";

        b1.displayBike();
    }
}