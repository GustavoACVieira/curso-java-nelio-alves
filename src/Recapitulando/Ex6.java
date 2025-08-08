package Recapitulando;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos reais você tem: R$");
        double reais = sc.nextDouble();
        double dolar = reais / 5.0;

        System.out.printf("Isto dá US$%.2f", dolar);
        sc.close();
    }
}
