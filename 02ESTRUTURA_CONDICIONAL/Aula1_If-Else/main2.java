import java.util.Scanner;

public class main2 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int hora;

      System.out.println("Quantas horas?");
      hora = sc.nextInt();

      //se a sentença for verdadeira, aparecerá a mensagem de bom dia
      if (hora<12) {
         System.out.println("Bom dia!");
      // se for falsa, aparecerá a mensagem de boa tarde
      } else {
         System.out.println("Boa tarde!");         
      } 
   
      sc.close();
   }
}
