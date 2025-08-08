package src.Section8;

import java.util.Locale;
import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CircleEx56 circle = new CircleEx56();

        circle.radius = sc.nextDouble();

        System.out.println(circle);
        sc.close();
    }
}
