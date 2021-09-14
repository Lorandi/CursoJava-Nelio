import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    // É uma estrutura de dados
    // Homogênea (dados do mesmo tipo)
    // Ordenada (elementos acessados por meio de posições
    // Inicia vazia e seus alementos são alocados sob demanda
    // Cada elemennto ocupa um nó (ou nodo) da lista e aponta para o seguinte

    // Tipo (interface): List - não pode ser intanciada
    // Classes que implementam: ArrayList, LinkedList...

    // Vantagens: tamanho variável, facilidade para realizar inserções e deleções
    // Desvantagens:  acesso sequencial aos elementos *

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Amelia");
        list.add("Gisele");
        list.add("João");
        list.add("Pedro");
        list.add("Fabio");
        list.add("Giordana");
        list.add("Claudia");
        list.add("Gabriel");


        System.out.println("Tamanho primeira lista: " + list.size());
        for (String x : list){
            System.out.println(x);
        }
        System.out.println();

        list.add(2,"Marco");
        System.out.println("Tamanho segunda lista: " + list.size());
        for (String x : list){
            System.out.println(x);
        }
        System.out.println();

        list.remove("João"); //remove primeira que aparece com essa string
        System.out.println("Tamanho terceira lista: " + list.size());
        for (String x : list){
            System.out.println(x);
        }
        System.out.println();

        list.remove(4); //remove quem estiver nessa posição
        System.out.println("Tamanho quarta lista: " + list.size());
        for (String x : list){
            System.out.println(x);
        }
        System.out.println();

        list.removeIf(x -> x.charAt(0) == 'G'); //remove quem começar com G - é um predicado
        System.out.println("Tamanho quinta lista: " + list.size());
        for (String x : list){
            System.out.println(x);
        }
        System.out.println();

        System.out.println("Index of Pedro: " + list.indexOf("Pedro"));
        System.out.println("Index of Inexistente: " + list.indexOf("Inexistente")); //retorna -1


        System.out.println();
        list.add("Amelia 2");
        list.add("Gisele");
        list.add("João");
        list.add("Pedro 2");
        list.add("Fabio");
        list.add("Giordana");
        list.add("Claudia 2");
        list.add("Gabriel");

        System.out.println("Tamanho sexta lista: " + list.size());
        for (String x : list){
            System.out.println(x);
        }
        System.out.println();

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'G').collect(Collectors.toList());

        //list.stream() // converte list para stream.tipo que aceita operações com expressões lambda
        //.filter() - recebe um predicado
        //.collect(Collectors.toList()) - converte novamente para lista


        System.out.println("Tamanho setima lista: " + list.size());
        for (String x : result){
            System.out.println(x);
        }

        System.out.println();

        String name = list.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);
        System.out.println(name); //retorna o primeiro elemento com o predicado (x -> x.charAt(0) == 'C')

        String nameNull = list.stream().filter(x -> x.charAt(0) == 'Y').findFirst().orElse(null);
        System.out.println(nameNull); //não irá encontrar o nome com o predicado (x -> x.charAt(0) == 'Y') e de deve retornar 'null'




    }

}
