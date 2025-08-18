/* Comparar duas datas
Peça para o usuário digitar duas datas.
Informe se a primeira é antes, igual ou depois da segunda usando .isBefore(), .isAfter() e .isEqual(). */

package src.Section11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //formatação
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //declarando data no formato (dd/MM/yyyy)
        System.out.print("Digite a primeira data (dd/MM/yyyy): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine(), fmt1);
        System.out.print("Digite a segunda data (dd/MM/yyyy): ");
        LocalDate date2 = LocalDate.parse(sc.nextLine(), fmt1);

        //printando se é antes, depois ou igual
        if (date1.isBefore(date2)) {
            System.out.println("A primeira data (" + date1 + ") é antes da segunda (" + date2 + ")");
        } else if (date1.isAfter(date2)) {
            System.out.println("A primeira data (" + date1 + ") é depois da segunda (" + date2 + ")");
        } else if (date1.isEqual(date2)) {
            System.out.println("A primeira data (" + date1 + ") é igual à segunda (" + date2 + ")");
        }
        sc.close();
    }
}
