package Recapitulando;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.print("É maior de Idade!");
        } else {
            System.out.print("É menor de Idade!");
        }
        sc.close();
    }
}
