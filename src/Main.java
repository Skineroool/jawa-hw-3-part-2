//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87 ;
        double weight = 98;
        double index = service.calculate(height, weight);
        int indexBmi = (int) index;
        System.out.println(indexBmi);
        }
    }