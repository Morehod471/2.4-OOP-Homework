import Transport.Bus;
import Transport.DriverB;
import Transport.PassengerCar;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {

        PassengerCar passengerCar1 = new PassengerCar("Volvo", "S60", 3.2);
        PassengerCar passengerCar2 = new PassengerCar("Ford", "Escort", 2.1);
        PassengerCar passengerCar3 = new PassengerCar("Peugeot", "207", 5.0);
        PassengerCar passengerCar4 = new PassengerCar("Seat", "Family", 1.5);

        Truck truck1 = new Truck("Man", "Home", 6.2);
        Truck truck2 = new Truck("Kamaz", "Master", 7.2);
        Truck truck3 = new Truck("Volvo", "Power", 8.0);
        Truck truck4 = new Truck("Lorry", "Sorry", 6.7);

        Bus bus1 = new Bus("Huyndai", "Tower", 4.5);
        Bus bus2 = new Bus("UAZ", "S500", 6.0);
        Bus bus3 = new Bus("PAZ", "Super", 5.1);
        Bus bus4 = new Bus("DMC", "Ultra", 4.8);

        DriverB<PassengerCar> driverB = new DriverB<PassengerCar>("John Will But", true, 20);
        System.out.println(driverB.getDriverLicense(passengerCar1));
    }
}