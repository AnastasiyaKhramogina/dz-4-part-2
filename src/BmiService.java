public class BmiService {
    public int calculate(int weightKilogram, double heightMeter) {

        double result = (weightKilogram / (heightMeter * heightMeter));

        return (int) result;
    }
}
