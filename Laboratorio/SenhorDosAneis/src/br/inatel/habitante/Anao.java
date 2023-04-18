package br.inatel.habitante;

import br.inatel.interfaces.Mineracao;

public class Anao extends Habitante implements Mineracao {
    private float altura;
    private String reino;

    // Construtor
    public Anao(int id, String nome, int idade, float energia) {
        super(id, nome, idade, energia);
    }

    @Override
    public void minerar() {

    }
}
