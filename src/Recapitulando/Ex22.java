package Recapitulando;
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--=MENU=--");
        System.out.println("1 - Depositar\n2 - Sacar\n3 - Sair");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Valor depositado!");
                break;
            case 2:
                System.out.print("Valor sacado!");
                break;
            case 3:
                System.out.println("Saindo...");
                System.out.println("...");
                break;
            default:
                System.out.println("Número não disponivel");
                break;
        }
        sc.close();
    }
}
