import java.util.Scanner;

public class main6estruturaFOR{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*ESTRUTURA FOR É FORMADA POR INICIALIZAÇÃO,
        CONDIÇÃO E FINALIZAÇÃO OU INCREMENTAÇÃO.
        */
        int N = sc.nextInt(); 
        int soma = 0;
       
        /*para i, se verdadeiro, executa os comandos
         e conta +1, até a condição ser falsa, quando
         for falsa, acaba a estrutura for e vai para o SOUT
         */
        for (int i = 0; i<N; i++){
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);

        sc.close();
    }
}

/*
    SINTAXE / REGRA
    for ( início ; condição ; incremento) {
        comando 1
        comando 2
    }

    **INÍCIO: Executa somente na primeira vez
    **CONDIÇÃO: Se verdadeira, executa e volta, se falsa, sai.
    **INCREMENTO/FINALIZAÇÃO: executa toda vez depois de voltar
 */