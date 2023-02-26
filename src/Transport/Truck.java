package Transport;

import java.util.List;

public class Truck extends Transport implements Competable {

    Weight weight;

    public enum Weight {
        N1(0F, 3.5F),
        N2(3.6F, 12.0F),
        N3(13F, 500F);

        private Float lowerBound;
        private Float upperBound;

        Weight(Float lowerBound, Float upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        public Float getLowerBound() {
            return lowerBound;
        }

        public Float getUpperBound() {
            return upperBound;
        }
    }

    public Truck(String brand, String model, double engineVolume, Driver driver, List<Mechanic> mechanicList, Weight weight) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck{ " +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + getEngineVolume() +
                ", driver=" + getDriver() +
                ", Weight " + (weight.getLowerBound() == 0 ? "" : "from " + weight.getLowerBound())
                + (weight.getUpperBound() == 500F ? "" : "up to " + weight.getUpperBound()) +
                '}';
    }

    @Override
    public Type getType() {
        return Type.TRUCK;
    }

    @Override
    public void printType() {
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

    @Override
    public boolean passDiagnostic() throws TransportTypeException {
        return true;
    }
}
