public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int result = service.calculate(52, 1.6);

        System.out.println(result);
    }
}