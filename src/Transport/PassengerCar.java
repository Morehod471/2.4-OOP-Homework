package Transport;

import java.util.List;
import java.util.Objects;

public class PassengerCar extends Transport implements Competable {

    private static Body body;

    public enum Body {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        OFF_ROAD("Внедорожник"),
        CROSS_OVER("Кроссовер"),
        PICK_UP("Пикап"),
        WAGON("Фургон"),
        MINIVAN("Минивен");

        private String bodyType;

        Body(String bodyType) {
            this.bodyType = bodyType;
        }

        public Body getBodyType() {
            return body;
        }
    }

    @Override
    public Type getType() {
        return Type.PASSENGER_CAR;
    }

    @Override
    public void printType() {

    }

    public PassengerCar(String brand, String model, double engineVolume, Driver driver, List<Mechanic> mechanicList, Body body) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.body = body;
    }

    @Override
    public String toString() {
        return "PassengerCar{ " +
                "brand = '" + getBrand() + '\'' +
                ", model = '" + getModel() + '\'' +
                ", engineVolume = " + getEngineVolume() +
                ", driver = " + getDriver() +
                ", body = " + body.getBodyType() +
                '}';
    }

    @Override
    void start() {
        System.out.println("Car start");
    }

    @Override
    void stop() {
        System.out.println("Car start");
    }

    @Override
    public void PitStop() {
        System.out.println("Make Pit-Stop");
    }

    @Override
    public void BestLapTime() {
        System.out.println("Best Lap Time");
    }

    @Override
    public void MaxSpeed() {
        System.out.println("Mas Speed");
    }

    @Override
    public boolean passDiagnostic() throws TransportTypeException {
        return true;
    }

    public static Body getBody() {
        return body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerCar)) return false;
        PassengerCar passengerCar = (PassengerCar) o;
        return Double.compare(passengerCar.getEngineVolume(), getEngineVolume()) == 0 && Objects.equals(getBrand(),
                passengerCar.getBrand()) && Objects.equals(getModel(),
                passengerCar.getModel()) && Objects.equals(getDriver(),
                passengerCar.getDriver()) && Objects.equals(getMechanicList(),
                passengerCar.getMechanicList()) && Objects.equals(mechanics, passengerCar.mechanics) &&
                Objects.equals(getBody() , getBody());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getEngineVolume(), getDriver(), getMechanicList(), mechanics, getBody());
    }
}
