package Recapitulando;
import java.util.Scanner;
import java.util.Locale;

public class Ex07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int numI = sc.nextInt();

        System.out.printf("Seu valor em double: %.2f", (double)numI);

        sc.close();
    }
}
