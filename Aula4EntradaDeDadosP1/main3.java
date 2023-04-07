//import java.util.Locale;
import java.util.Scanner;
public class main3 {
   public static void main(String[] args) {
      //SE for usar o separador de decimais como ponto, ANTES da declaração "scanner" utilizar o "Locale.setDefault(Locale.US);"
      //SE usar, não esquecer de importar o java.util.locale no início do código: import java.util.Locale;
      //Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      double x;
      x = sc.nextDouble();

      //Para usar o separador de decimais com vírgula, deverá usar o "printf" ao invés do "println"
      //E não esquecer de formatar a variável pra sair com a vírgula
      System.out.printf("Você digitou: %.1f%n", x);
      sc.close();
   }
}
