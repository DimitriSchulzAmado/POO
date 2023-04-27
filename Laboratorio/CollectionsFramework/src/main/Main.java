package main;
/*
 * Usaremos basicamente as coisas de algoritmos II
 * "HashMap<tipo_da_chave, tipo_do_valor>" é um "Map" só que do jeito do java, usa o conceito chave-valor
 * "HashSet<tipo_do_valor>" é tipo "Set" só que do jeito java, não pode valor repetido, ele é uma lista mesmo
*/
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Nome: Idade
        HashMap<String, Integer> studentsAge = new HashMap<String, Integer>();
        // Adicionando dados
        studentsAge.put("Pedro", 20);
        studentsAge.put("Dimitri", 19);
        studentsAge.put("Luis", 21);
        studentsAge.put("Maria", 18);

        // Removendo dados e imprimindo os valores pelo forEach
        studentsAge.remove("Dimitri");
        studentsAge.forEach((String key, Integer value) -> {
            System.out.println("O aluno " + key + " tem a idade de " + value + " anos.");
        });

        // Hash Set -> Não aceita valores duplicados
        HashSet<Integer> hashSet = new HashSet<>();
    }
}
