import java.util.Scanner;

public class main6 {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      //indicando os tipos de variáveis
      String s1, s2, s3;

      //indicando que cada dado das variáveis irão ter uma quebra de linha
      s1 = sc.nextLine();
      s2 = sc.nextLine();
      s3 = sc.nextLine();

      System.out.println("DADOS DIGITADOS: ");
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);

      sc.close();
   }
}
