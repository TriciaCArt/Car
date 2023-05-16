public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Car samCar = new Car();

        samCar.getYear();
        samCar.getMake();
        samCar.getModel();
        samCar.toString();
        System.out.println(samCar);

        Car trishCar = new Car("Suburu", "Outback", 2008);
        System.out.println(trishCar);
        trishCar.toString();

        Car beezCar = new Car();
        beezCar.setMake("Pontiac");
        beezCar.setModel("GrandAm");
        beezCar.setYear(2003);
        beezCar.toString();
        System.out.println(beezCar);
    }
}