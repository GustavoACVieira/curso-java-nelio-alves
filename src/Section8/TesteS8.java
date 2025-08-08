package src.Section8;

import java.util.Locale;
import java.util.Scanner;

public class TesteS8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Entre com as medidas do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Entre com as medidas do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.calculoDeArea();
        double areaY = y.calculoDeArea();

        System.out.printf("Área triângulo X: %.4f%n", areaX);
        System.out.printf("Área triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Área X é a maior!");
        } else {
            System.out.println("Área Y é a maior!");
        }
        sc.close();
    }
}
