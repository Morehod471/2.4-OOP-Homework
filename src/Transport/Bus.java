package Transport;

public class Bus extends Transport implements Competable {

    BusCapacity busCapacity;

    public enum BusCapacity {
        Small(null, 10),
        Little(10, 25),
        Middle(25, 50 ),
        Large(50, 80),
        ExtraLarge(80, null);

        private Integer lowerBound;
        private Integer upperBound;

        BusCapacity(Integer lowerBound, Integer upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        public Integer getLowerBound() {
            return lowerBound;
        }

        public Integer getUpperBound() {
            return upperBound;
        }
    }

    public Bus(String brand, String model, double engineVolume, BusCapacity busCapacity) {
        super(brand, model, engineVolume);
        this.busCapacity = busCapacity;
    }

    @Override
    public String toString() {
        return "Bus {" +
                " brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", engineVolume = " + engineVolume +
                ", Bus Capacity = " + (busCapacity.getLowerBound() == null ? "" : busCapacity.getLowerBound()) +
                " - " + (busCapacity.getUpperBound() == null ? "" : busCapacity.getUpperBound()) +
                '}';
    }

    @Override
    public void getType() {
    }

    @Override
    public void printType() {
        System.out.println(getClass());
    }

    @Override
    void start() {
        System.out.println("Bus start");
    }

    @Override
    void stop() {
        System.out.println("Bus stop");
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
