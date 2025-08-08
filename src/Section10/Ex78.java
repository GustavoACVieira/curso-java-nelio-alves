package src.Section10;

import java.util.Locale;
import java.util.Scanner;

public class Ex78 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //declarando o vetor, as variáveis de menor e maior, a média da altura das mulheres
        //e quantos homens tem
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();
        PersonEx78[] arrayPerson = new PersonEx78[n];
        double shorterHeight = 0.0, greaterHeight = 0.0, averageHeightWomans = 0.0;
        int countMen = 0, countWoman = 0;

        //preenchendo o vetor e todas as variáveis
        for (int i = 0; i < arrayPerson.length; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            double heigh = sc.nextDouble();
            sc.nextLine();
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            String gender = sc.nextLine();
            arrayPerson[i] = new PersonEx78(heigh, gender);

            //se for homem vai conta quantos tem, se for mulher vai fazer a média de altura
            if (arrayPerson[i].getGender().equals("M")) {
                countMen++;
            } else if (arrayPerson[i].getGender().equals("F")) {
                averageHeightWomans += arrayPerson[i].getHeight();
                countWoman++;
            }

            //pegando a menor altura e maior
            if (shorterHeight == 0.0 || arrayPerson[i].getHeight() < shorterHeight) {
                shorterHeight = arrayPerson[i].getHeight();
            }
            if (arrayPerson[i].getHeight() > greaterHeight) {
                greaterHeight = arrayPerson[i].getHeight();
            }
        }
        averageHeightWomans /= countWoman;

        //printando os resultados
        System.out.println("Menor altura = " + shorterHeight);
        System.out.println("Maior altura = " + greaterHeight);
        System.out.printf("Media das alturas das mulheres = %.2f%n", averageHeightWomans);
        System.out.println("Numero de homens = " + countMen);

        sc.close();
    }
}
