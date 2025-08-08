package src.Section10;

import java.util.Locale;
import java.util.Scanner;

public class Ex70 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        PessoaEx70[] arrayPerson = new PessoaEx70[n];

        //preenchendo o vetor da classe pessoa
        for (int i = 0; i < arrayPerson.length; i++) {
            sc.nextLine();
            System.out.printf("Dados pessoa da %da pessoa: ", i + 1);
            System.out.print("\nNome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            arrayPerson[i] = new PessoaEx70(name, age, height);
        }

        //calculando a altura média e a porcentagem de pessoas menor de 16 anos
        double averageHeight = 0.0;
        int peopleUnder16YearsOld = 0;
        for (int i = 0; i < arrayPerson.length; i++) {
            //altura média
            averageHeight += arrayPerson[i].getHeight();

            //pessoas com menos de 16
            if (arrayPerson[i].getAge() < 16) {
                peopleUnder16YearsOld++;
            }
        }
        averageHeight /= arrayPerson.length;
        double peopleUnder16YearsOldPercentage = (peopleUnder16YearsOld * 100) / arrayPerson.length;

        //printando os resultados
        System.out.printf("Altura média: %.2f", averageHeight);
        System.out.println("\nPessoas com menos de 16 anos: "+ peopleUnder16YearsOldPercentage + "%");
        for (int i = 0; i < arrayPerson.length; i++) {
            if (arrayPerson[i].getAge() < 16) {
                System.out.println(arrayPerson[i].getName());
            }
        }

        sc.close();
    }
}
