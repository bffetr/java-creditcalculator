public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Размер ежемесячного платежа при сроке кредита на 1 год составит:");
        System.out.println(Math.floor(service.calculate(1_000_000, 9.99, 1)));

        System.out.println();
        System.out.println("Размер ежемесячного платежа при сроке кредита на 2 года составит:");
        System.out.println(Math.floor(service.calculate(1_000_000, 9.99, 2)));

        System.out.println();
        System.out.println("Размер ежемесячного платежа при сроке кредита на 3 года составит:");
        System.out.println(Math.floor(service.calculate(1_000_000, 9.99, 3)));
    }
}
