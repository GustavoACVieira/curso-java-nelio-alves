package src.Section8;

import java.util.Locale;
import java.util.Scanner;

public class Ex63 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int opcao;
        System.out.println("Escolha a conversão desejada: ");
        do {
            System.out.println("\n1 - Celcius para Fahrenheit\n2 - Fahrenheit para Celcius\n0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            if (opcao != 0) {
                System.out.println("Digite a temperatura: ");
                double temp = sc.nextDouble();
                System.out.println("=".repeat(5) + "Conversor de Temperatura" + "=".repeat(5));
                if (opcao == 1) {
                    System.out.printf("%.1fC equivalem a %.1fF", temp, TemperatureConverterEx63.celciusToFarenheit(temp));
                    System.out.println();
                    System.out.println("=".repeat(35));
                } else if (opcao == 2) {
                    System.out.printf("%.1fF equivalem a %.1fC", temp, TemperatureConverterEx63.fahrenheitToCelcius(temp));
                    System.out.println();
                    System.out.println("=".repeat(35));
                }
            }
        } while (opcao != 0);

        sc.close();
    }
}
