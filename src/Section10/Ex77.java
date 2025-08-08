/*Fazer um programa para ler um conjunto de N nomes de alunos,
bem como as notas que eles tiraram no 1º e 2º semestres.
Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes
dos alunos aprovados, considerando aprovados aqueles cuja média das notas
seja maior ou igual a 6.0 (seis). */

package src.Section10;

import java.util.Locale;
import java.util.Scanner;

public class Ex77 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //declarando o vetor
        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        sc.nextLine();
        StudentEx77[] arrayStudent = new StudentEx77[n];

        //Preenchendo o vetor
        for (int i = 0; i < arrayStudent.length; i++) {
            System.out.println("Digite nome, primeira e segunda nota do "+ (i + 1) + "o aluno: ");
            String name = sc.nextLine();
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            sc.nextLine();
            arrayStudent[i] = new StudentEx77(name, n1, n2);
        }

        //printando os alunos aprovados
        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < arrayStudent.length; i++) {
            double studentAverage = arrayStudent[i].getNota1() + arrayStudent[i].getNota2();
            if ((studentAverage / 2) >= 6.0) {
                System.out.println(arrayStudent[i].getName());
            }
        }

        sc.close();
    }
}
