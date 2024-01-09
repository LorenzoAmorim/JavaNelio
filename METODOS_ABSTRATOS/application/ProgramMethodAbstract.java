package METODOS_ABSTRATOS.application;

import METODOS_ABSTRATOS.entities.Circle;
import METODOS_ABSTRATOS.entities.Rectangle;
import METODOS_ABSTRATOS.entities.Shape;
import METODOS_ABSTRATOS.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramMethodAbstract {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++ ) {
            System.out.print("Shape #" + i + " data:");

            System.out.print("Rectangle or Circle (r/c)?");
            char rc = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED):");
            Color color = Color.valueOf(sc.next());

            if(rc == 'r'){
                System.out.print("Widht:");
                double width = sc.nextDouble();

                System.out.print("Heigth:");
                double height = sc.nextDouble();

                list.add(new Rectangle(color, width, height));
            }else{
                System.out.print("Radius: ");
                double Radius = sc.nextDouble();

                list.add(new Circle(color, Radius));
            }

            System.out.println();
            System.out.println("SHAPE AREAS:");

            for(Shape shape : list ){
                System.out.println(shape.area());
            }

        }
        sc.close();
    }
}
