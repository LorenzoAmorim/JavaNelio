import java.util.Locale;
import java.util.Scanner;

public class Vector2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        //definimos o "n" como variável para adicionarmos um valor.
        int n = sc.nextInt();
        /*definimos um array da classe "Product" instanciada como "vect".
        que recebe a classe "Product" com o array valendo "n"(valor que definimos acima).*/
        Product[] vect = new Product[n];

        //estrutura de repetição "for" para executar os nomes e dados dos produtos.
        for (int i = 0; i<n; i++){
            //quebra de linha para consumir a outra quebra de linha do "int n" acima.
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            //vetor sendo definido para armazenar o nome e preço nas variáveis "String" e "price" acima.
            vect[i] = new Product(name, price);
        }

        //varável double para armazenarmos a soma dos valores dos produtos.
        double sum = 0.0;
        //estrutura "for" para definir a quantidade de vezes que o valor do produto é escolhido.
        for(int i = 0; i<n; i++){
            //estamos acessando o vetor na posição "i" e pegando apenas o PREÇO ao invés do nome e preço.
            sum += vect[i].getPrice();
        }

        //criamos uma variável double para armazenar o valor da soma dividido por "n" para obtermos o valor da média.
        double avg = sum /n;

        System.out.printf("AVERAGE PRICE= %.2f%n", avg);
        sc.close();
    }
}