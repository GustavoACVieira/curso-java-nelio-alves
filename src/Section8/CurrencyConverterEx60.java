package src.Section8;

public class CurrencyConverterEx60 {
    public static final double IOF = 0.06;

    public static double converter(double valueDolar, double qtdDolar) {
        return qtdDolar * (valueDolar + (valueDolar * IOF));
    }
}
