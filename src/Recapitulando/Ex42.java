package Recapitulando;
import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, countPos = 0, countNeg = 0;
        do {
            num = sc.nextInt();
            if (num >= 0) {
                countPos++;
            } else {
                countNeg++;
            }
        } while (num != 999);
        System.out.println("Positivos: " + (countPos - 1) + "\nNegativos: " + countNeg);

        sc.close();
    }
}
