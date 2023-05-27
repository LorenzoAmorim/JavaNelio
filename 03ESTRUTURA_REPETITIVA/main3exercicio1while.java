import java.util.Scanner;

public class main3exercicio1while{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int senha = sc.nextInt();
        /*ENQUANTO O RESULTADO DENTRO DE while FOR VERDADEIRO, A FUNÇÃO while SE REPETE
        SE FOR FALSA, A FUNÇÃO while TERMINA E PARTE PARA A PRÓXIMA FUNÇÃO, OU ACABA*/
        while(senha != 2002){
            System.out.println("Senha invalida");
            senha = sc.nextInt();
        }
        
        System.out.println("Acesso permitido");
        sc.close();
    }
    
}