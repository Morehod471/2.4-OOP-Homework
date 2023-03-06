import Transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Mechanic mechanicPeter = new Mechanic("Peter", "RusAuto");
        Mechanic mechanicLeonid = new Mechanic("Leonid", "BVC");
        Mechanic mechanicVoldemar = new Mechanic("Voldemar", "TO");

        DriverB<PassengerCar> driverB = new DriverB<PassengerCar>("John Will But", true, 20);
        DriverC<Truck> driverC = new DriverC<Truck>("Alan William Ready", true, 5);
        DriverD<Bus> driverD = new DriverD<Bus>("Sergei Ivan Smith", true, 10);

        PassengerCar passengerCar1 = new PassengerCar("Volvo", "S60", 3.2, driverB, List.of(mechanicLeonid), PassengerCar.Body.SEDAN);
        PassengerCar passengerCar2 = new PassengerCar("Ford", "Escort", 2.1, driverB, List.of(mechanicPeter), PassengerCar.Body.COUPE);
        PassengerCar passengerCar3 = new PassengerCar("Peugeot", "207", 5.0, driverB, List.of(mechanicVoldemar), PassengerCar.Body.HATCHBACK);
        PassengerCar passengerCar4 = new PassengerCar("Seat", "Family", 1.5, driverB, List.of(mechanicLeonid), PassengerCar.Body.UNIVERSAL);

        Truck truck1 = new Truck("Man", "Home", 6.2, driverC, List.of(mechanicPeter), Truck.Weight.N2);
        Truck truck2 = new Truck("Kamaz", "Master", 7.2, driverC, List.of(mechanicVoldemar), Truck.Weight.N3);
        Truck truck3 = new Truck("Volvo", "Power", 8.0, driverC, List.of(mechanicLeonid), Truck.Weight.N2);
        Truck truck4 = new Truck("Lorry", "Sorry", 6.7, driverC, List.of(mechanicPeter), Truck.Weight.N1);

        Bus bus1 = new Bus("Huyndai", "Tower", 4.5, driverD, List.of(mechanicVoldemar), Bus.BusCapacity.LITTLE);
        Bus bus2 = new Bus("UAZ", "S500", 6.0, driverD, List.of(mechanicLeonid), Bus.BusCapacity.SMALL);
        Bus bus3 = new Bus("PAZ", "Super", 5.1, driverD, List.of(mechanicPeter), Bus.BusCapacity.LARGE);
        Bus bus4 = new Bus("DMC", "Ultra", 4.8, driverD, List.of(mechanicVoldemar), Bus.BusCapacity.EXTRA_LARGE);

        Map<Transport, List<Mechanic>> mapOfCarsAndMechanics = new HashMap<>();

        mapOfCarsAndMechanics.put(passengerCar1, passengerCar1.getMechanicList());
        mapOfCarsAndMechanics.put(truck4, truck4.getMechanicList());
        mapOfCarsAndMechanics.put(bus2, bus2.getMechanicList());

        for (Map.Entry<Transport, List<Mechanic>> map : mapOfCarsAndMechanics.entrySet()) {
            System.out.println("Машина " + map.getKey() + " Механик " + map.getValue());
        }

        Set<Driver> driverSet = new HashSet<>();

        driverSet.add(driverB);
        driverSet.add(driverC);
        driverSet.add(driverD);
        driverSet.add(driverC);
        Iterator<Driver> iterDriver = driverSet.iterator();

        while (iterDriver.hasNext()) {
            System.out.println(iterDriver.next());
        }

//        System.out.println(driverB.getDriverLicense(passengerCar1));
//        System.out.println();
//        System.out.println(passengerCar1);
//        System.out.println();
//        System.out.println(truck2);
//        System.out.println();
//        System.out.println(bus4);
//        System.out.println();
//        bus1.printType();
//        System.out.println();
//        passengerCar1.passDiagnostic();
//        truck1.passDiagnostic();
//        bus1.passDiagnostic();

//        List<Transport> cars = new ArrayList<>(12);
//        cars.add(passengerCar1);
//        cars.add(truck2);
//        cars.add(bus3);
//        System.out.println(cars);
    }
}