public class Hangar {
    public static void main(String[] args) {
        Car car = new Car("Clio", 20000);
        Boat boat = new Boat("Titanic", 500000);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }

}