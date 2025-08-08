package Recapitulando;
import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int countIn = 0, countOut = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num >= 10 && num <= 20) {
                countIn++;
            } else {
                countOut++;
            }
        }
        System.out.println(countIn + " in\n" + countOut + " out");

        sc.close();
    }
}
