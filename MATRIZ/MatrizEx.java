package MATRIZ;

import java.util.Scanner;

public class MatrizEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //matriz = array bidimensionado, ou seja, linha e coluna, representados pelos "[] []"
        /*matriz definida como "mat" que recebe 2 arrays([]), irão receber a variável "n" como entrada,
        sendo cada linha e coluna, o mesmo valor de 'n' */
        int [][] mat = new int[n][n];

        //para cada linha "i" percorre-se cada coluna "j", adicionando-se o seu valor ao final do loop for.
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                //aqui é adicionado os valores das linhas e colunas
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        /*Aqui é percorrido os valores em diagonal, como os valores definidos na diagonal da matriz, têm o
        número de linhas e colunas iguais, é definido que mostre na tela, cada linha [] "i" e coluna [] "i"
         iguais (i e i)*/
        for (int i =0; i<n; i++ ){
            System.out.println(mat[i][i] + " ");
        }

        //variável para números negativos definida como 0.
        int negNum = 0;
        /*Para cada linha "i", percorre-se cada coluna "j", percorrendo também a matriz de linha"[i]" e
        coluna "[j]" menores que 0, incrementando o número de números negativos na variável "negNum". */
        for(int i = 0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    negNum++;
                }
            }
        }
        System.out.println("Negative numbers = " + negNum);

        sc.close();
    }
}
