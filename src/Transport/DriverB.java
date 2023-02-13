package Transport;

public class DriverB<T extends PassengerCar> extends Driver {

    public DriverB(String nameSurnamePatronymic, boolean isDrivingLicense, int experience) {
        super(nameSurnamePatronymic, isDrivingLicense, experience);
    }

    @Override
    public void start() {System.out.println("Start moving");}

    @Override
    public void stop() {System.out.println("Stop moving");}

    @Override
    public void refuelCar() {System.out.println("Refuel the Car");}

    public String getDriverLicense(T passengerCar) {
        return "Driver " + getNameSurnamePatronymic() + " Car " + passengerCar.getBrand() + " " + passengerCar.getModel() + " will participate in race";
    }
}
