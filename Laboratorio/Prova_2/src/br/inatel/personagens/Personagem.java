package br.inatel.personagens;

public abstract class Personagem {

    // Atributos dos personagens
    private static int numPersonagens; // Qtd de personagens
    private int idPersonagem; // Identificação do personagem
    private int vida; // Qtd de vida do personagem

    // Construtor
    public Personagem(int vida, int idPersonagem) {
        this.idPersonagem = idPersonagem;
        this.vida = vida;
        numPersonagens++;

        // Instanciando a cidade quando o personagem for criado
        Cidade cidade = new Cidade();
    }

    // Mostrando informações do personagem
    public void mostrarInfos(){
        System.out.println("------ Personagem: " + this.idPersonagem + " ------");
        System.out.println("Vida: " + this.vida);
    }
}
