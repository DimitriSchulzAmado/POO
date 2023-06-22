package main;

public class Funcionario {
    // Atributos
    private String nome;
    private int salario;
    
    // Criando os getters para as informações do funcionario
    public Funcionario(String nome, int salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }
}
