/* Fazer um programa para ler um número inteiro N e
depois os dados (id, nome e salario) de N funcionários. Não deve haver repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X.
Se o id informado não existir, mostrar uma mensagem e abortar a operação.
Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
aumento por porcentagem dada. (Neste exercício irei comentar linha por linha por ser um desafio) */

package src.Section10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex84 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //n será o tamanho da lista
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        //declarando a lista do tipo EmployeeEx84(classe que fiz)
        List<EmployeeEx84> listEmployee = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            //equanto a função hasID retornar true será pedido pro usuário informar outro ID
            while (hasID(listEmployee, id)) {
                System.out.println("ID already taken! Try again: ");
                id = sc.nextInt();
            }
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.println();

            //adicionando na lista um EmployeeEx84
            listEmployee.add(new EmployeeEx84(id, name, salary));
        }

        //pedindo o ID pro usuário
        System.out.print("Enter the employee id that will have salary increase: ");
        int idToIncrease = sc.nextInt();

        //transformando o listEmployee em stream, o filter procura o id correspondente a idToIncrease, se não achar retorna null
        EmployeeEx84 emp = listEmployee.stream().filter(x -> x.getID() == idToIncrease).findFirst().orElse(null);
        //se retornar null o id não existe e não haverá aumento
        if (emp == null) {
            System.out.println("This id does not exits!");
        } else {
            //se retornar algo diferente de null, é chamado a função increaseSalary passando percent como parâmetro
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        //printando a lista
        System.out.println("\nList of employees: ");
        for (EmployeeEx84 employ : listEmployee) {
            System.out.println(employ);
        }

        sc.close();
    }

    //classe estática para conseguir se comunicar com main(também estático).
    //classe booleana (retorna true ou false)
    public static boolean hasID (List<EmployeeEx84> list, int id) {
        //transforma a lista em stream, filtra ela tentando achar um ID já existente, se não houver retorna null
        EmployeeEx84 emp = list.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
        //aqui é uma condicional, se emp for diferente de null(se houver um ID) ele retorna
        return emp != null;
    }
}