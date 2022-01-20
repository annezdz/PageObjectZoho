package memoriasArraysListas.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploListas {
    public static void main(String[] args) {

        //Array List melhores caracteristicas do vetor e da lista

        List<String> list = new ArrayList<>();

        //adicionando elementos na lista

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        //adicionando um elemento em determinada posição

        list.add(2,"Marco");


        //ver o tamanho da lista
        System.out.println(list.size());

        //Removendo um elemento pelo nome

        //list.remove("Anna");

        //removendo um elemento pelo indice

        //list.remove(1);

        //Imprimindo os valores com foreach

        for (String x : list) {
            System.out.println(x);
        }


        //removendo por um predicado (lambda retornando verdadeiro ou falso) e removendo todos
        //os nomes que iniciam com leta M

        list.removeIf(x -> x.charAt(0) == 'M');
        System.out.println("----------------------");

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("----------------------");

        //encontrar a posição de um elemento
        System.out.println("Index of BOB : " + list.indexOf("Bob"));
        System.out.println("Index of Marco : " + list.indexOf("Marco")); // quando o indexOf não encontra
        // um elemento ele retorna -1


        //Exemplo filtrando a lista onde queremos deixar apenas quem inicia com a letra M
        System.out.println("----------------------");

        //usando o stream - tipo especial que aceita expressões com lambda
        // como o stream não é compativel com List, precisamos converte-lo novamente para lista
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String res : result) {
            System.out.println(res);
        }

        //Encontrando um elemento da lista que atenda determinado predicado
        System.out.println("--------Encontrando elemento na lista -------------------");
        //usando o find first e o Optional. COm o findFirst() procura o
        //primeiro elemento que inicia com A, se ele não existir, com o orElse ele retorna null

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        String exemploNulo = list.stream().filter(x -> x.charAt(0) == 'K').findFirst().orElse(null);

        System.out.println(name);
        System.out.println(exemploNulo);


    }
}
