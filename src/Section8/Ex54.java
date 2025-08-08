package src.Section8;

import java.util.Locale;
import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        EmployeeEx54 employee = new EmployeeEx54();

        employee.name = sc.nextLine();
        employee.grossSalary = sc.nextDouble();
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee);
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Updated data: " + employee);
        sc.close();
    }
}
