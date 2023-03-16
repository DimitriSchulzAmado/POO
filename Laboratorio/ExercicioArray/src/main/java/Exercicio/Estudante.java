package Exercicio;

public class Estudante {
    // Atributos do estudante
    String nome;
    int idade;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void mostraInfo() {
        System.out.println("INFOS DO ALUNO");
        System.out.println("NOME: " + this.nome);
        System.out.println("IDADE: " + this.idade);
    }
}
