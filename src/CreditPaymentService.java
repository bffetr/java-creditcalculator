public class CreditPaymentService {

    public double calculate(int sum, double percent, int period) {
        double a;
        int n = period * 12;
        double i = percent / 12 / 100;
        double k = i * Math.pow(1 + i, n) / (Math.pow(1 + i, n) - 1);
        a = k * sum;
        return a;

    }

}
