import java.util.Locale;
import java.util.Scanner;

public class ex6 {
   public static void main(String[] args) {
      
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      float A,B,C;
      double triangulo,circulo,trapezio,quadrado,retangulo;

      A = sc.nextFloat();
      B = sc.nextFloat();
      C = sc.nextFloat();

      triangulo = (A*C) / 2;
      circulo = 3.14159 * C * C;
      trapezio = ((A + A)/2) * C;
      quadrado = B *B;
      retangulo = A * B;

      System.out.println("TRIANGULO: " + triangulo);
      System.out.println("CIRCULO: " + circulo);
      System.out.println("TRAPEZIO: " + trapezio);
      System.out.println("QUADRADO: " + quadrado);
      System.out.println("RETANGULO: " + retangulo);

   }
}
