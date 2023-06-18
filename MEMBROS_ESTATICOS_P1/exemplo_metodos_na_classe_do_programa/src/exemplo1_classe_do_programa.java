package MEMBROS_ESTATICOS_P1.exemplo_metodos_na_classe_do_programa.src;

import java.util.Locale;
import java.util.Scanner;
//EXEMPLO 1-  métodos na própria classe do programa
public class exemplo1_classe_do_programa {
    //Membro estático na classe declarado com o valor "PI = 3.14159"
    //Palavara "final" serve para dizer que o valor "PI" é constante e não irá mais mudar
    public static final double PI = 3.14159;
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        /*Como não pode nenhuma variável sem algum valor dentro dela, as variáveis "double c" e "double v"
        recebem o valor do argumento "radius" para fazer o calculos da circunferência e do volume do circulo*/
        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("Circumference: %.2f \n", c);
        System.out.printf("Volume: %.2f \n", v);
        System.out.printf("PI Value: %.2f \n", PI);

        sc.close();
        
    }
    public static double circumference(double radius){
        return 2.0 * PI * radius;
    }
    public static double volume(double radius){
        return 4.0 * PI * radius * radius *radius /3.0;
    }
}


/* NESTE PRIMEIRO EXEMPLO, PERCEBE-SE QUE TODOS OS MEMBROS (public static) DA CLASSE SÃO "public static"
    POIS NÃO SE PODE CHAMAR MÉTODOS NÃO ESTÁTICOS DENTRO DE MÉTODOS ESTÁTICOS, COMO NO EXEMPLO 2, ONDE
    EM OUTRA CLASSE AS FÓRMULAS SÃO FEITAS E A CONSTANTE "PI" TAMBÉM É CHAMADA, OS MEMBROS ESTÁTICOS NÃO
    PRECISAM SER CHAMADOS 
*/
// Nota: dentro de um método estático você não pode chamar membros de instância da mesma classe.