package Section7;

import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base: ");
        double b = sc.nextDouble();
        System.out.println("Digite a altura: ");
        double a = sc.nextDouble();

        double result = areaTriangulo(b, a);
        System.out.printf("Area do triângulo: %.2f", result);

        sc.close();
    }

    public static double areaTriangulo(double base, double altura) {
        double area = (base * altura) / 2;
        return area;
    }
}
