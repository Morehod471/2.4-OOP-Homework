package Transport;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Driver{ " +
                "name= '" + nameSurnamePatronymic + '\'' +
                ", isDrivingLicense= " + isDrivingLicense +
                ", experience= " + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver driver = (Driver) o;
        return isDrivingLicense() == driver.isDrivingLicense() && getExperience() == driver.getExperience() && Objects.equals(getNameSurnamePatronymic(), driver.getNameSurnamePatronymic());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameSurnamePatronymic(), isDrivingLicense(), getExperience());
    }
}
