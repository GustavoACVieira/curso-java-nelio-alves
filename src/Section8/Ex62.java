package src.Section8;

import java.util.Locale;
import java.util.Scanner;

public class Ex62 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase: ");
        String texto = sc.nextLine();

        boolean isPalindromo = StringUtilsEx62.ehPalindromo(texto);

        System.out.println("=".repeat(5) + "Verificador de Palíndromo" + "=".repeat(5));
        System.out.println("Texto informado: " + texto);
        if (isPalindromo == true) {
            System.out.println("É um palíndromo? Sim!");
        } else {
            System.out.println("É um palíndromo? Não!");
        }
        System.out.println("=".repeat(35));
        sc.close();
    }
}
