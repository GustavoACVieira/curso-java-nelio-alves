package src.Section8;

import java.util.Locale;
import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        StudentEx55 student = new StudentEx55();

        student.name = sc.nextLine();
        student.note1 = sc.nextDouble();
        student.note2 = sc.nextDouble();
        student.note3 = sc.nextDouble();

        System.out.println(student);

        if (student.gradeNote() > 60) {
            student.isApproval();
        } else {
            student.noApproval();
        }

        if (student.approval == true) {
            System.out.println("PASS");
        } else {
            System.out.printf("FAILED\nMISSING %.2f POINTS", 60 - student.gradeNote());
        }

        sc.close();
    }
}
