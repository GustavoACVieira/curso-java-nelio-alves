package src.Section8;

import java.util.Locale;
import java.util.Scanner;

public class Ex61 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Number 1: ");
        double n1 = sc.nextDouble();
        System.out.println("Number 2: ");
        double n2 = sc.nextDouble();

        System.out.println("=".repeat(5) + "Resultados da Calculadora" + "=".repeat(5));
        double resultadoOperacao = CalculatorEx61.somar(n1, n2);
        System.out.printf("Soma: %.1f + %.1f = %.1f\n", n1, n2, resultadoOperacao);

        resultadoOperacao = CalculatorEx61.subtrair(n1, n2);
        System.out.printf("Subtração: %.1f - %.1f = %.1f\n", n1, n2, resultadoOperacao);

        resultadoOperacao = CalculatorEx61.multiplicar(n1, n2);
        System.out.printf("Multiplicação: %.1f x %.1f = %.1f\n", n1, n2, resultadoOperacao);

        resultadoOperacao = CalculatorEx61.dividir(n1, n2);
        if (resultadoOperacao == 0) {
            System.out.println("Divisão impossível!");
        } else {
            System.out.printf("Divisão: %.1f / %.1f = %.1f\n", n1, n2, resultadoOperacao);
        }
        System.out.println("=".repeat(35));

        sc.close();
    }
}
