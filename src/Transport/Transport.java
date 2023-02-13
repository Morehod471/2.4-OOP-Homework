package Transport;

import static Transport.CarService.validNumber;
import static Transport.CarService.validTrait;

public abstract class Transport {

    public String brand;
    public String model;
    public double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = validTranpsportTrait(brand);
        this.model = validTranpsportTrait(model);
        this.engineVolume = validEngineVolume(engineVolume);
    }

    public String getBrand() {return brand;}

    public String getModel() {return model;}

    public double getEngineVolume() {return engineVolume;}

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
}