package Transport;

public class Truck extends Transport implements Competable{
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void start() {
        System.out.println("Truck start");
    }

    @Override
    void stop() {
        System.out.println("Truck stop");
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
}
