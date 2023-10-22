package LISTAS.src;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Jorgi");
        list.add("Maiki");
        list.add("Anilker");
        list.add("Bleide");
        list.add("Edward");
        list.add("Anastacio");
        //Adiciona um nome na posição 2
        list.add(2, "Marco");

        //mostra o tamanho da lista
        System.out.println(list.size());

        //remove o nome da posição 1
        list.remove(1);

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------");

        //Função de predicado do lambda, remove todos os nomes com a inicial "M".
        //"X" recebe o valor na posição 0 de cada caractere da lista, retornando um valor booleano (v ou f)
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("----------");

        //função Index Of, achar a posição do elemento na lista
        System.out.println("Index Of Anastacio: " + list.indexOf("Anastacio"));
        System.out.println("-----------");

        //Função de predicado do lambda, deixa apenas os nomes que começam com a inicial "A".
        /*Primeiro a lista é convertida para stream -que é uma sequência de elementos que podemos
        processar de forma eficiente e declarativa, para filtrar, mapear, reduzir etc.-
        Após, filtrada para selcionar apenas os nomes que inciam com a letra "A", e depois voltar
         com a operação "stream" para lista novamente, com a operação "collect"*/
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("--------------");

        /*função "findFirst" -retorna um "Optional<String>"- pega o primeiro elemento do "stream", e retorna nulo "null" se
        esse elemento não existir */
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

    }
}
/*

 */
