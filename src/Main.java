//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.87;
        int weightInKg = 98;
        double index = service.calculate(heightInMeters, weightInKg);
        int indexBmi = (int) index;
        System.out.println(indexBmi);
    }
}