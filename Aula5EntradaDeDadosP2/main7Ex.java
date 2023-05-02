import java.util.Scanner;

public class main7Ex {
   public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);

      int x;
      String s1, s2, s3;
      //quando é usado um comando de leitura diferente de nextLine() e o próximo é uma quebra de linha, ela fica pendente na entrada padrão e é absorvida pelo proximo nextLine() ou seja, o s2.
      x = sc.nextInt();
      //então é necessário adicionar um nextLine() extra antes do NextLine() de interesse
      sc.nextLine();
      s1 = sc.nextLine();
      s2 = sc.nextLine();
      s3 = sc.nextLine();
       
      System.out.println("DADOS DIGITADOS: ");
      System.out.println(x);
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);

      sc.close();
   }   
}
