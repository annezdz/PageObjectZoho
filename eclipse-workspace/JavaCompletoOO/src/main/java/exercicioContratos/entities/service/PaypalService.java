package exercicioContratos.entities.service;

public class PaypalService implements OnlinePaymentService {

    private static final double FEE_PERCENTUAL = 0.02;
    private static final double MONTH_INTEREST = 0.01;

    @Override
    public double paymentFee(double amount) {
        return amount * FEE_PERCENTUAL;
    }

    @Override
    public double interest(double amount, int months) {
        return amount * MONTH_INTEREST * months;
    }
}
