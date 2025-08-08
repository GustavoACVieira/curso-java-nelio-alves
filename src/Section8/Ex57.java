package src.Section8;

import java.util.Locale;
import java.util.Scanner;

public class Ex57 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CarEx57 car = new CarEx57();

        System.out.print("Enter car model: ");
        car.model = sc.nextLine();

        System.out.print("Enter fuel consumption (km per liter): ");
        car.fuelConsumption = sc.nextDouble();

        System.out.print("Enter liters of fuel to refuel: ");
        car.fuel = sc.nextDouble();

        System.out.print("Enter distance to drive (km): ");
        double distance = sc.nextDouble();

        car.drive(distance);

        System.out.println("\nCar status:");
        System.out.println(car);

        sc.close();
    }
}
