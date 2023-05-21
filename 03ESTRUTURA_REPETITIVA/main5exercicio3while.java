import java.util.Scanner;

public class main5exercicio3while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //TIPO DE COMBUSTIVEL
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        //TIPO DE COMBUSTIVEL
        int combustivel = sc.nextInt();
        
        /*ENQUANTO O COMBUSTIVEL NÃO FOR 4
        E FOR 1,2 OU 3, ELE IRÁ SER ALOCADO NAS VARIÁVEIS
        DE TIPO DE COMBUSTÍVEL
        */
        while(combustivel != 4){
            if (combustivel == 1){
                alcool = alcool +1;
            }else if(combustivel == 2){
                gasolina = gasolina +1;
            }else if(combustivel == 3){
                diesel = diesel +1;
            }
            combustivel = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}