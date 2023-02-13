package Transport;

public class Driver {
    public String nameSurnamePatronymic;
    public boolean isDrivingLicense;
    public int experience;

    public Driver(String nameSurnamePatronymic, boolean isDrivingLicense, int experience) {
        this.nameSurnamePatronymic = nameSurnamePatronymic;
        this.isDrivingLicense = isDrivingLicense;
        this.experience = experience;
    }

    public String getNameSurnamePatronymic() {
        return nameSurnamePatronymic;
    }

    public boolean isDrivingLicense() {
        return isDrivingLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void start() {}

    public void stop() {}

    public void refuelCar() {}
}
