package MEMBROS_ESTATICOS_P1.exemplo_classe_Calculator_com_metodo_estatico.src;

import java.util.Locale;
import java.util.Scanner;

import MEMBROS_ESTATICOS_P1.exemplo_classe_Calculator_com_metodo_estatico.src.util.Calculator3;

public class exemplo3_classe_calculator_metodo_estatico {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator3.circumference(radius);

        double v = Calculator3.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI Value: %.2f%n", Calculator3.PI);

        sc.close();
        
    }
}
