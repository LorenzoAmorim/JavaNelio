import java.util.Locale;

public class Aula1 {
   public static void main(String[] args) {

      String nome = "Maria";
      int idade = 31;
      double renda = 4000.0;
      double x = 10.35784;


      System.out.printf("%.2f%n", x);
      System.out.println("Olá Mundo!");
      Locale.setDefault(Locale.US);
      System.out.printf("%.2f%n", x);
      System.out.println("RESULTADO= " + x + " METROS");
      System.out.printf("RESULTADO = %.2f METROS%n", x);
      System.out.printf("%s tem %d anos e ganha R$%.2f%n", nome, idade, renda);
   }
}
