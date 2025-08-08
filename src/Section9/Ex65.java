package src.Section9;

import java.util.Scanner;

public class Ex65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LivroEx65 livro = new LivroEx65();

        System.out.println("Informe o titulo do livro: ");
        livro.setTitulo(sc.nextLine());
        System.out.println("Informe o autor do livro: ");
        livro.setAutor(sc.nextLine());
        System.out.println("Número de páginas: ");
        livro.setPagina(sc.nextInt());
        System.out.println("Tá emprestado? (y/n)");
        char opcao = sc.next().charAt(0);
        if (opcao == 'y') {
            livro.emprestar();
        } else {
            livro.devolver();
        }

        System.out.println(livro);
        sc.close();
    }
}
