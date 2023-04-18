package br.inatel.habitante;

public abstract class Habitante {
    // Atributos da Classe
    public static int contador;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;

    // Construtor
    public Habitante(int id, String nome, int idade, float energia) {
        this.energia = energia;
        this.idade = idade;
        this.nome = nome;
        this.id = id;
        contador++;

        // Instanciando lugar onde vive
        TerraMedia moradia = new TerraMedia();
    }

    // Método Atacar
    public void atacar() {

    }

    // Método para mostrar informações gerais
    public void mostraInfo() {

    }
}
