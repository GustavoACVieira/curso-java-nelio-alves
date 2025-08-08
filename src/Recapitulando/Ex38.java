package Recapitulando;
import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("1 - Olá\n2 - Informe seu nome\n0 - Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Olá!");
                    break;
                case 2:
                    String nome = sc.nextLine();
                    break;
                default:
                    break;
            }
        } while (opcao != 0);
        sc.close();
    }
}
