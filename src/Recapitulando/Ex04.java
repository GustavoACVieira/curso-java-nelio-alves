package Recapitulando;
import java.util.Scanner;
import java.util.Locale;

public class Ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a temperatura em Celcius: ");
        double celcius = sc.nextDouble();
        double fahrenheit = (9 * celcius) / 5 + 32;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        sc.close();
    }
}
