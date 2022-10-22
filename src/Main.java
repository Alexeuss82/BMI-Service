public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 57;
        double height = 1.66;
        double bodyMassIndex = service.calculate(weight,height);
        System.out.println("Ваш индекс массы тела = " + bodyMassIndex + " !");
    }
}

