package Transport;

import java.util.ArrayList;
import java.util.List;

import static Transport.CarService.validNumber;
import static Transport.CarService.validTrait;

public abstract class Transport {

    private String brand;
    private String model;
    private double engineVolume;
    private Driver driver;
    private List<Mechanic> mechanicList;

    public enum Type {
        PASSENGER_CAR,
        TRUCK,
        BUS;
    }

    List<Mechanic> mechanics = new ArrayList<>(4);

    public abstract Type getType();

    public abstract void printType();

    public Transport(String brand, String model, double engineVolume, Driver driver, List<Mechanic> mechanicList) {
        this.brand = validTranpsportTrait(brand);
        this.model = validTranpsportTrait(model);
        this.engineVolume = validEngineVolume(engineVolume);
        this.driver = driver;
        this.mechanicList = mechanicList;
    }

    public String getBrand() {return brand;}

    public String getModel() {return model;}

    public double getEngineVolume() {return engineVolume;}

    public Driver getDriver() {
        return driver;
    }

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public void setBrand(String brand) {this.brand = brand;}

    public void setModel(String model) {this.model = model;}

    public void setEngineVolume(double engineVolume) {this.engineVolume = engineVolume;}

    public String validTranpsportTrait(String value) {
        return validTrait(value, "default");
    }

    public double validEngineVolume(double value) {
        return validNumber(value, 1.5);
    }

    void start() {}

    void stop() {}

    public abstract boolean passDiagnostic() throws TransportTypeException;

    public boolean needDiagnostic() {
        try {
            passDiagnostic();
        } catch (TransportTypeException e) {
            return false;
        }
        return true;
    }
}