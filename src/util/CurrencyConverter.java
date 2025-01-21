package util;

public class CurrencyConverter {
    public static double IOF = 0.06;
    public static double DollarToReal(double dollar_price,double dollar_quantity){
        return dollar_price * dollar_quantity * (1.0 + IOF);
    }
    }
