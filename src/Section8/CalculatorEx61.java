package src.Section8;

import org.w3c.dom.ls.LSOutput;

public class CalculatorEx61 {
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }
}
