package br.inate.mamiferos;

public class Cachorro extends Mamiferos {

    public Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    // Sobrescreve o método emitirSom
    @Override
    public void emitirSom() {
        System.out.print("O cachorro " + super.nome + " ");

        super.emitirSom();
    }

    // Sobrescreve o método mostraInfo
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("------ INFO DO CACHORRO ------");
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
    }
}
