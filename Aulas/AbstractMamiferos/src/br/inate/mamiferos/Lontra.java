package br.inate.mamiferos;

public class Lontra extends Mamiferos {
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.print("A lontra " + super.nome + " ");
        super.emitirSom();
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("------ INFO DA LONTRA ------");
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
    }
}
