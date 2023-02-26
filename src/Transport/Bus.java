package Transport;

import java.util.List;

public class Bus extends Transport implements Competable {

    BusCapacity busCapacity;

    public enum BusCapacity {
        SMALL(0, 10),
        LITTLE(11, 25),
        MIDDLE(26, 50 ),
        LARGE(51, 80),
        EXTRA_LARGE(81, 500);

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

    public Bus(String brand, String model, double engineVolume, Driver driver, List<Mechanic> mechanicList, BusCapacity busCapacity) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.busCapacity = busCapacity;
    }

    @Override
    public String toString() {
        return "Bus {" +
                " brand = '" + getBrand() + '\'' +
                ", model = '" + getModel() + '\'' +
                ", engineVolume = " + getEngineVolume() +
                ", driver = " + getDriver() +
                ", Bus Capacity = " + (busCapacity.getLowerBound() == null ? "" : busCapacity.getLowerBound()) +
                " - " + (busCapacity.getUpperBound() == null ? "" : busCapacity.getUpperBound()) +
                '}';
    }

    @Override
    public Type getType() {
        return Type.BUS;
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

    @Override
    public boolean passDiagnostic() throws TransportTypeException {
        throw new TransportTypeException("Автобусы не проходят диагностику");
    }
}
