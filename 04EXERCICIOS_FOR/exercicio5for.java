import java.util.Scanner;

public class exercicio5for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//INSERIR O VALOR DE n

        int fat=1;//fat RECEBE 1

        for(int i=1;i<=n;i++){/*PARA i RECEBE 1, ENQUANTO i FOR MENOR OU IGUAL
         A n, i RECEBE +1*/
            fat = fat*i;    
        }

        System.out.println(fat);

        sc.close();
    }
}
