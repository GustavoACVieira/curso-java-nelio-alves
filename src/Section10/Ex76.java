/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades.
Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor.
Depois, mostrar na tela o nome da pessoa mais velha. */

package src.Section10;

import java.util.Scanner;

public class Ex76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declarando o vetor e a variável para guardar a pessoa mais velha
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        PersonEx76[] arrayPerson = new PersonEx76[n];
        PersonEx76 olderPerson = new PersonEx76();

        //preenchendo o vetor e guardando o mais velho
        for (int i = 0; i < arrayPerson.length; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            arrayPerson[i] = new PersonEx76(name, age);
            if (olderPerson.getAge() < arrayPerson[i].getAge()) {
                olderPerson = arrayPerson[i];
            }
        }

        //printando o resultado
        System.out.print("PESSOA MAIS VELHA: " + olderPerson.getName());

        sc.close();
    }
}
