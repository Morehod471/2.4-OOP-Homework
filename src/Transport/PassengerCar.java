package Transport;

public class PassengerCar extends Transport implements Competable {

    Body body;

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

        public String getBodyType() {
            return bodyType;
        }
    }

    @Override
    void getType() {

    }

    @Override
    void printType() {

    }

    public PassengerCar(String brand, String model, double engineVolume, Body body) {
        super(brand, model, engineVolume);
        this.body = body;
    }

    @Override
    public String toString() {
        return "PassengerCar{ " +
                "brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", engineVolume = " + engineVolume +
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
}
