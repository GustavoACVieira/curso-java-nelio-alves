package Recapitulando;
import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a base: ");
        int base = sc.nextInt();
        System.out.print("Informe a altura: ");
        int altura = sc.nextInt();

        double areaT = (double)base * altura / 2;

        System.out.printf("A area do triangulo que tem a base %d e a altura %d, tem area igual a %.2f", base, altura, areaT);
        sc.close();
    }
}
