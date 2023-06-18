package MEMBROS_ESTATICOS_P1.exemplo_classe_Calculator_com_membros_de_instancia.src;
import java.util.Locale;
import java.util.Scanner;

import MEMBROS_ESTATICOS_P1.exemplo_classe_Calculator_com_membros_de_instancia.src.util.Calculator2;

public class exemplo2_classe_calculator_membro_instancia {
    //EXEMPLO2 -  classe Calculator com membros de instância
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator2 calc = new Calculator2();

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);

        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI Value: %.2f%n", calc.PI);

        sc.close();
        
    }
}
