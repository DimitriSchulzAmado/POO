package Exercicio;

public class Student {
    // Atributos do estudante
    String name;
    int idade;
    String year;

    public Student(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    void mostraInfo() {
        System.out.println("INFOS DO ALUNO");
        System.out.println("NOME: " + this.name);
        System.out.println("IDADE: " + this.idade);
    }
}
