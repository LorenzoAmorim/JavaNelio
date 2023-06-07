package PRIMEIRO_EXERCICIO_CLASSES_METODO.course.src.application;

import java.util.Locale;
import java.util.Scanner;

import PRIMEIRO_EXERCICIO_CLASSES_METODO.course.src.entities.Rectangle;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();
        System.out.println("AREA = " + rectangle.Area());
        System.out.println("PERIMETER = " + rectangle.Perimeter());
        System.out.println("DIAGONAL = " + rectangle.Diagonal());

        sc.close();
    }
}
