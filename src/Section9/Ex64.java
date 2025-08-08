package src.Section9;

import java.util.Locale;
import java.util.Scanner;

public class Ex64 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaBancariaEx64 conta;

        System.out.print("Enter account number: ");
        String number = sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char opcao = sc.nextLine().charAt(0);
        if (opcao == 'y') {
            System.out.print("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            conta = new ContaBancariaEx64(number, name, deposit);
        } else {
            conta = new ContaBancariaEx64(number, name);
        }

        System.out.println("\nAccount Data: ");
        System.out.println(conta);

        System.out.print("\nEnter a deposit value: ");
        conta.accountDeposit(sc.nextDouble());
        System.out.println("Update account data: ");
        System.out.println(conta);

        System.out.print("\nEnter a withdraw value: ");
        conta.accountWithdrawal(sc.nextDouble());
        System.out.println("Update account data: ");
        System.out.println(conta);

        sc.close();
    }
}
