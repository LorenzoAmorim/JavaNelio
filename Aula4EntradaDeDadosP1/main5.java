import java.util.Locale;
import java.util.Scanner;
public class main5 {
   public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      String x;
      int y;
      double z;

      //para palavra-string = next
      x = sc.next();
      //para número-inteiro = nextInt
      y = sc.nextInt();
      //para número-double = nextDouble 
      z = sc.nextDouble();

      System.out.println("Dados digitados:" + x +" " + y + " " + z);
      System.out.println(x);
      System.out.println(y);
      //número double tem que ser com ponto, se não definir o Locale ou se não for "printf"
      System.out.println(z);

      sc.close();
   }
}
