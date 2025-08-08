package Recapitulando;
import java.util.Scanner;
import java.util.Locale;

public class Ex17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu peso: ");
        double peso = sc.nextDouble();
        System.out.print("Informe sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.print("Você está abaixo do peso!");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.print("Você está com o peso normal!");
        } else {
            System.out.print("Você está acima do peso!");
        }

        sc.close();
    }
}
