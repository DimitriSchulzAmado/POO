package br.inate.mamiferos;

public class Boi extends Mamiferos {
    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    // Sobrescreve o método emitirSom
    @Override
    public void emitirSom() {
        System.out.print("O boi " + super.nome + " ");
        super.emitirSom();
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("------ INFO DO BOI ------");
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
    }
}
