package src.Section8;

import java.util.Locale;
import java.util.Scanner;

public class Ex59 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        TrilhaSonoraEx59 trilhaSonora = new TrilhaSonoraEx59();

        System.out.println("Informe o nome da trilha: ");
        trilhaSonora.nome = sc.nextLine();
        System.out.println("Informe a duração da trilha: ");
        trilhaSonora.duracao = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe a sua avaliação: ");
            double nota = sc.nextDouble();
            trilhaSonora.qtdAvaliacoes++;
            trilhaSonora.avaliarNota(nota);
        }

        System.out.println(trilhaSonora);
        sc.close();
    }
}
