package br.inatel.personagens;

import br.inatel.interfaces.Aprimorar;
import br.inatel.interfaces.Lutar;

public class Humano extends Personagem implements Aprimorar, Lutar {
    // Atributos
    private String nome; // Nome do humano
    private int idade; // Idade do humano
    private boolean vagalume; // vagalume ou não
    private double energia; // Energia do humano
    private double distanciaEscuta; // distancia que ele escuta

    // Instanciando Arma
    Arma arma;

    // Construtor
    public Humano(int vida, int idPersonagem) {
        super(vida, idPersonagem);
    }

    @Override
    public void mostrarInfos() {
        super.mostrarInfos();
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if(this.vagalume)
            System.out.println("É vagalume");
        else
            System.out.println("Não é vagalume");
        System.out.println("Energia: " + this.energia);
        System.out.println("Distancia Escuta: " + this.distanciaEscuta);
    }

    public void addArma(Arma arma) {
        arma = new Arma();
    }

    // Métodos relacionados a Arma
    @Override
    public void modificarArma() {
        arma.setForca(80);
        arma.setTipoArma("pistola");
    }

    @Override
    public void modificarHabilidades(int qtdPilulas, String tipoHabilidade) {

    }

    // Métodos relacionados a Lutar
    @Override
    public void atacar() {
        if(arma == null)
            System.out.println("Arma não adicionada para o humano");
        else
            System.out.println("O humano " + this.nome + " atacou com a arma " + arma);
    }

    @Override
    public void defender() {

    }

    // Setters para adicionar as informações aos humanos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setVagalume(boolean vagalume) {
        this.vagalume = vagalume;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public void setDistanciaEscuta(double distanciaEscuta) {
        this.distanciaEscuta = distanciaEscuta;
    }
}
