package src.Section8;

import java.util.Locale;
import java.util.Scanner;

public class Ex58 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DroneEx58 drone = new DroneEx58();

        System.out.println("Informe o ID do drone: ");
        drone.id = sc.nextInt();
        System.out.println("Informe a altura dele: ");
        drone.altura = sc.nextDouble();
        System.out.println("Informe a porcentagem da bateria: ");
        drone.bateria = sc.nextDouble();

        System.out.println("Quantos metros ele subiu: ");
        double metros = sc.nextDouble();
        drone.subir(metros);
        System.out.printf("Subindo %.2f metros...\n", metros);

        System.out.println("Quantos metros ele desceu: ");
        metros = sc.nextDouble();
        drone.descer(metros);
        System.out.printf("Descendo %.2f metros...\n",metros);

        System.out.println(drone);
        sc.close();
    }
}
