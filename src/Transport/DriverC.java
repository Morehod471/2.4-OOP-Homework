package Transport;

public class DriverC<T extends Truck> extends Driver {

    public DriverC(String nameSurnamePatronymic, boolean isDrivingLicense, int experience) {
        super(nameSurnamePatronymic, isDrivingLicense, experience);
    }

    @Override
    public void start() {
        System.out.println("Start moving");
    }

    @Override
    public void stop() {
        System.out.println("Stop moving");
    }

    @Override
    public void refuelCar() {
        System.out.println("Refuel the Car");
    }

    public String getDriverLicense(T truck) {
        return "Driver" + getNameSurnamePatronymic() + truck.getBrand() + " " + truck.getModel() + "will participate in race";
    }

}
