public class Main {
    public static void main(String[] args) {

        Car car = new Car("Porsh", 272);
        Truck truck = new Truck("Mersedes", 256);
        Pesenger pesenger = new Pesenger("BMW", 292);


        System.out.println(car);
        car.getMaxSpeed();

        System.out.println(truck);
        truck.getMaxSpeed();

        System.out.println(pesenger);
        pesenger.getMaxSpeed();


    }
}