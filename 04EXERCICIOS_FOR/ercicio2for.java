import java.util.Scanner;

public class ercicio2for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //VALOR PARA SER INSERIDO NA VARIÁVEL n
        int n = sc.nextInt();
        int in = 0; //in RECEBE 0
        int out = 0;//out RECEBE 0
        
        //i RECEBE 0, i TEM QUE SER MENOR QUE n, i RECEBE +1 ENQUANTO FOR MENOR QUE n
        for (int i = 0; i<n; i++){
            int x = sc.nextInt();//ENQUANTO i FOR MENOR QUE n SELECIONE UM VALOR PARA x
            if(x>=10 && x<=20){//SE x FOR ENTRE 10 E 20...
                in = in +1;//... O in RECEBE +1
            }else{//SENÃO 
                out = out+1;//out RECEBE +1
            }
        }
        
        System.out.println((in + " in"));
        System.out.println(out + " out");

        sc.close();
    }
}
