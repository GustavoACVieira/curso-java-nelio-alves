package Recapitulando;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua senha: ");
        int senha = sc.nextInt();

        if (senha == 1234) {
            System.out.print("A senha é igual!");
        } else {
            System.out.print("A senha é diferente!");
        }

        sc.close();
    }
}
