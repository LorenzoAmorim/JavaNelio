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

        sc.close();
    }
}
