import java.util.Scanner;

public class sintaxe1 {//criaremos a nossa própria função

    //função padrão que vai ser executada em primeiro lugar
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a,b,c);

        showResult(higher);
        sc.close();
    }
    /*CRIAREMOS NOSSA PRÓPRIA FUNÇÃO A PARTIR DA VARIÁVEL "higher" e 
    "showResult"*/
    
    //public: para a função ficar disponível em outras classes
    //static: para que função possa ser chamada independente de se criar um objeto
    //int: pois a função irá me retornar um número inteiro
    //max: nome da função
    //(...): declarar quais os dados essa função recebe de entrada(3 números inteiros) OBS: não precisa ser o mesmo nome da primeira variável
    public static int max (int x, int y, int z){
        //IMPLEMENTAR A LÓGICA DA FUNÇÃO

        //variável apenas deste escopo
        int aux;
        if(x>y && x>z){
            aux = x;
        }else if (y>z){
            aux = y;
        }else{
            aux = z;
        }
        //o valor verdadeiro irá ser alocado na variável "aux"

        //adicionar o valor dessa função (public static int max) que irá retornar na função "max"
        //essa função estará na variável "higher" pois será retornada na função "max" 
        return aux;
    }

    //criação da função para definir a lógica a partir da variável "showResult"
    /*OBS: a função "showResult" faz uma ação(apenas retorna um valor na tela) sem retornar um valor no 
    programa, o tipo da função é vazia (void)*/
    //(...): parâmetros que a função showResult recebe
    public static void showResult (int value){
        //essa função não irá retornar nada na tela, apenas irá definir uma lógica para a variável "showResult" da função principal
        System.out.println("Higher = " + value);
    }
}





