package Exercicio;

public class Student {
    // Atributos do estudante
    String name;
    int age;
    String year;

    public Student(String name, int age, String year) {
        this.name = name;
        this.age = age;
        this.year = year;
    }

    void mostraInfo() {
        System.out.println("INFOS DO ALUNO");
        System.out.println("NOME: " + this.name);
        System.out.println("IDADE: " + this.age);
    }
}
