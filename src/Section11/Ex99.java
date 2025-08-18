/* Criar data a partir de valores separados
Peça ano, mês e dia separadamente.
Crie um LocalDate com .of() e exiba no formato dd/MM/yyyy.*/

package src.Section11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o ano: ");
        int year = sc.nextInt();
        System.out.println("Informe o mês: ");
        int month = sc.nextInt();
        System.out.println("Informe o dia: ");
        int day = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, day);

        System.out.println("Data: " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        sc.close();
    }
}
