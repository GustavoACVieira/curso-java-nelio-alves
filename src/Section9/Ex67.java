package src.Section9;

import java.util.Locale;
import java.util.Scanner;

public class Ex67 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do celular: ");
        String numero = sc.nextLine();

        System.out.println("Digite o saldo inicial: ");
        double saldo = sc.nextDouble();

        PlanoTelefoneEx67 celular = new PlanoTelefoneEx67(numero, saldo);

        // Mostrar dados iniciais
        System.out.println("\n=== DADOS INICIAIS ===");
        System.out.println(celular);

        // Adicionar crédito
        System.out.println("\nAdicione crédito: ");
        celular.adicionarCredito(sc.nextDouble());
        System.out.println(celular);

        // Fazer ligação simples
        System.out.println("\nQuanto tempo durou a ligação? ");
        celular.fazerLigacao(sc.nextInt());
        System.out.println(celular);

        // Fazer ligação com destino
        sc.nextLine(); // limpa buffer
        System.out.println("\nPra quem você ligou?");
        String ligacao = sc.nextLine();
        System.out.println("Quanto tempo durou?");
        int tempo = sc.nextInt();
        celular.fazerLigacao(ligacao, tempo);

        // Mostrar dados finais
        System.out.println("\n=== DADOS FINAIS ===");
        System.out.println(celular);

        sc.close();
    }
}
