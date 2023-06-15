package TERCEIRO_EXERCICIO_CLASSES_METODOS.course.src;
import java.util.Locale;
import java.util.Scanner;

import TERCEIRO_EXERCICIO_CLASSES_METODOS.course.entities.Students;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Students students = new Students();
        
        students.student = sc.nextLine();
        students.grade1 = sc.nextDouble();
        students.grade2 = sc.nextDouble();
        students.grade3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + students.finalGrade());
        if(students.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", students.missingPoints());
        }else{
            System.out.println("PASS");
        }
        sc.close();
    }
    
}
    