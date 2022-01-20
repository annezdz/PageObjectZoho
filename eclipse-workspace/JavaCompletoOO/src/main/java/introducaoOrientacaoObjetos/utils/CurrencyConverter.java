package introducaoOrientacaoObjetos.utils;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double converter(double price, double amount) {
        return amount * price + ((amount * price)* IOF);
    }
}
