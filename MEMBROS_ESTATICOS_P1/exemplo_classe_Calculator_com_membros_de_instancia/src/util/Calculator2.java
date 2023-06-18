package MEMBROS_ESTATICOS_P1.exemplo_classe_Calculator_com_membros_de_instancia.src.util;

public class Calculator2 {
    //EXEMPLO2 -  classe Calculator com membros de instância
    public final double PI = 3.14159;

    public double circumference(double radius){
        return 2.0 * PI * radius;
    }
    public double volume(double radius){
        return 4.0 * PI * radius * radius *radius /3;
    }
}
/* PERCEBE-SE QUE AQUI NESSA CLASSE OS MÉTODOS NÃO PRECISAM SER ESTÁTICOS, POIS NÃO ESTÃO DENTRO
 * DE UM MÉTODO PRINCIPAL ESTÁTICO.
 */