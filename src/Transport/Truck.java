package Transport;

public class Truck extends Transport implements Competable {

    Weight weight;

    public enum Weight {
        N1(null, 3.5F),
        N2(3.5F, 12.0F),
        N3(12F, null);

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


    public Truck(String brand, String model, double engineVolume, Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck{ " +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", Weight " + (weight.getLowerBound() == null ? "" : "from " + weight.getLowerBound())
                + (weight.getUpperBound() == null ? "" : "up to " + weight.getUpperBound()) +
                '}';
    }

    @Override
    void getType() {

    }

    @Override
    void printType() {

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
