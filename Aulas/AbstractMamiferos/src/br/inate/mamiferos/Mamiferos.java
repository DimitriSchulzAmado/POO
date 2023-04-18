package br.inate.mamiferos;

public abstract class Mamiferos {
    protected String nome;
    protected double vida;

    public Mamiferos(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void emitirSom() {
        System.out.println("emitiu um som...");
    }

    public void mostraInfo() {

    }
}
