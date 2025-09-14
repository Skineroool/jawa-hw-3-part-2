public class BmiService {
    public int calculate(double heightInMeters, int weightInKg) {
        double result;
        result = weightInKg / (heightInMeters * heightInMeters);
        return (int) result;
    }
}
