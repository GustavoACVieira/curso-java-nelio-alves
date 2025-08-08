package src.Section10;

import java.util.Scanner;

public class Ex79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declarando o vetor
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();
        RoomEx79[] arrayRoom = new RoomEx79[10];

        //preenchendo o vetor
        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int aux = sc.nextInt();
            arrayRoom[aux] = new RoomEx79(name, email);
            sc.nextLine();
        }

        //printando os quartos
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (arrayRoom[i] != null) {
                System.out.println(i + ": " + arrayRoom[i]);
            }
        }

        sc.close();
    }
}
