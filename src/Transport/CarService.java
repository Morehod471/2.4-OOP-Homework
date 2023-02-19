package Transport;

public class CarService {
    public static String validTrait(String trait, String defaultValue) {
        return (trait == null || trait.isEmpty() || trait.isBlank()) ? defaultValue : trait;
    }

    public static double validNumber(double value, double defaultValue) {
        return (value <= 0 ? defaultValue : value);
    }
}