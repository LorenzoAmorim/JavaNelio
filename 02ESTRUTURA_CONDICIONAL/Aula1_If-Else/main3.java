import java.util.Scanner;
//SE HOUVER MAIS DE 2 POSSIBILIDADES, FAREMOS O ENCADEAMENTO DE ESTRUTURAS CONDICIONAIS
public class main3 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int horas;
      System.out.println("Que horas são?");
      horas = sc.nextInt();
      
      //só irá aparecer a mensagem do if se for uma verdadeira sentença
      if (horas <12) {
         System.out.println("Bom dia!");
      //teve mais de 2 possibilidades então usamos o encadeamento de estruturas
      } else {//leia-se apenas "senão"(else-if)
         if (horas >= 12 && horas <=18) {
            System.out.println("Boa tarde!");
         } else {//leia-se então o último else
            System.out.println("Boa noite!");
         }
      }
      sc.close();
   }
}
