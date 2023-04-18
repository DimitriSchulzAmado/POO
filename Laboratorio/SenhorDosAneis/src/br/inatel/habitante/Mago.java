package br.inatel.habitante;

import br.inatel.interfaces.Cura;
import br.inatel.interfaces.Feitico;

public class Mago extends Habitante implements Cura, Feitico {
    private String cor;

    public Mago(int id, String nome, int idade, float energia) {
        super(id, nome, idade, energia);
    }

    @Override
    public void curar() {
        System.out.println("O mago está curando");
    }

    @Override
    public void lancaFeitico() {
        System.out.println("O mago lançou um feitiço");
    }

    public String getCor() {
        return cor;
    }
}
