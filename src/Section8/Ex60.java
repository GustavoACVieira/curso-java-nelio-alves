package src.Section8;

import java.util.Locale;
import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double valueDolar = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double amountDolars = sc.nextDouble();

        double total = CurrencyConverterEx60.converter(valueDolar, amountDolars);

        System.out.printf("Amount to be paid in reais = %.2f", total);
        sc.close();
    }
}
