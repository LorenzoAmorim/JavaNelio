import java.util.Locale;//PARA IMPORTAR A BIBLIOTECA LOCALE
import java.util.Scanner;//PARA IMPORTAR A BIBLIOTECA DE SCANNER

public class exercicio3for {
    public static void main(String[] args) {
        /*PARA DEFINIR O LOCAL PADRÃO DE LÍNGUA FALADA
        (NESSE CASO O PONTO, AO INVÉS DA VÍRGULA)
        */
        Locale.setDefault(Locale.US);
        //PARA CHAMAR O SCANNER
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();//INSERIR O VALOR DA VARIÁVEL n
        
        for(int i = 0; i<n; i++){//PARA O VALOR DE i RECEBE 0, i TEM QUE SER MENOR QUE n, ENTÃO CASO A CONDIÇÃO VERDADEIRA i RECEBE +1
            double v1 = sc.nextDouble();
            double v2 = sc.nextDouble();
            double v3 = sc.nextDouble();
        
            
            double media = (v1*2.0 + v2*3.0 + v3*5.0)/10.0;

           System.out.printf("%.1f%n" + media); 
        }
        

        sc.close();
    }
}
