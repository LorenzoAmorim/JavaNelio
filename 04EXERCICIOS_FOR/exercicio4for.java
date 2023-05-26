import java.util.Scanner;//IMPORTAR A BIBLIOTECA SCANNER

public class exercicio4for {
    public static void main(String[] args) {
        //ADICIONAR O RECURSO SCANNER PARA LER UM VALOR
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//INSERIR O VALOR DA VARIÁVEL n

        for(int i = 0; i<n; i++){//PARA i RECEBE 0, i TEM QUE SER MENOR DO QUE n, ENQUANTO ESSA CONDIÇÃO FOR VERDADEIRA i RECEBE +1
            int n1 = sc.nextInt();//INSERIR O VALOR DE n1
            int n2 = sc.nextInt();//INSERIR O VALOR DE n2

            double divisao = (double) n1/n2;/*DIVISÃO ENTRE n1 E n2 RECEBE O TIPO double (DETALHE QUE A VARIÁVEL n1 RECEBE UM "double")
            POIS ANTERIORMENTE ELA FOI DEFINIDA COMO int
            */
            if(n2 == 0){ //SE O RESULTADO DE n2 FOR IGUAL A 0...
                System.out.println("divisão impossível");//... RECEBERÁ A SEGUINTE MENSAGEM
            }else{//SENÃO..
                System.out.println(divisao);//... A DIVISÃO É MOSTRADA NA TELA
            }
        }

        sc.close();
    }   
}

