package src.Section8;

import java.util.Locale;
import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        RectangleEx53 rectangle = new RectangleEx53();

        System.out.println("Enter rectangle width and heigth: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println(rectangle);

        sc.close();
    }
}
