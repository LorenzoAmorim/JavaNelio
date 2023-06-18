package MEMBROS_ESTATICOS_P1.exemplo_classe_Calculator_com_metodo_estatico.src.util;

public class Calculator3 {
    //EXEMPLO 3 -  classe Calculator com métodos estáticos

    //PI será uma constante que independe de qualquer objeto do tipo Calculator
    public static final double PI = 3.14159;

    public static double circumference(double radius){
        return 2.0 * PI * radius;
    }
    public static double volume(double radius){
        return 4.0 * PI * radius * radius *radius /3;
    }
}
