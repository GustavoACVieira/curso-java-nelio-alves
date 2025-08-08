package Recapitulando;
import java.util.Scanner;
import java.util.Locale;

public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Informe a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.print("Informe a terceira nota: ");
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.printf("Sua média é: %.2f", media);

        sc.close();
    }
}
