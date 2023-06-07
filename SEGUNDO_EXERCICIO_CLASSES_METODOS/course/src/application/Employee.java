package SEGUNDO_EXERCICIO_CLASSES_METODOS.course.src.application;

import java.util.Locale;
import java.util.Scanner;

import SEGUNDO_EXERCICIO_CLASSES_METODOS.course.src.entities.EmployeeData;

public class Employee {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        EmployeeData data = new EmployeeData();

        System.out.print("Name: ");
        data.name = sc.nextLine();
        System.out.print("Gross salary: ");
        data.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        data.Tax = sc.nextDouble();
        System.out.println();
        System.out.print("Employee: " + data.name + ", " + "$ " + data.NetSalary());
        System.out.println("\n");
        System.out.print("Wich percentage to increase salary? ");
        /*Solicita ao usuário a porcentagem de aumento salarial desejada e a armazena na variável percentage. 
        Em seguida, o método IncreaseSalary() do objeto data é chamado, passando a porcentagem como argumento.
        Isso aumenta o salário bruto de acordo com a porcentagem fornecida.*/
        double percentage = sc.nextDouble();
        data.IncreaseSalary(percentage);
        System.out.println("\nUpdated data: " + data.toString());

        sc.close();
    }
}
