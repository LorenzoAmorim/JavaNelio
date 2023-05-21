import java.util.Scanner;

public class main4exercicio2while {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        /*ENQUANTO OS DOIS VALORES FOREM DIFFERENTES DE 0
        O PROGRAMA IRÁ VERIFICAR SE ELES SE ENQUADRAM NOS IF,
        ELSE IF OU ELSE
        */
        while(x != 0 && y != 0 ){
            if( x > 0 && y> 0){
                System.out.println("primeiro");
                break;
            }
            else if(x<0 && y>0){
                System.out.println("segundo");
                break;
            }else if(x<0 && y<0){
                System.out.println("terceiro");
                break;
            }else{
                System.out.println("quarto");
                break;
            }
        }

        sc.close(); 
    }
}
