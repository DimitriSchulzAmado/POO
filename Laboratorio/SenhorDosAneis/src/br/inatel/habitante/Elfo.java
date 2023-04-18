package br.inatel.habitante;

import br.inatel.interfaces.Cura;

public class Elfo extends Habitante implements Cura {
    private String tribo;

    // Cosntrutor
    public Elfo(int id, String nome, int idade, float energia) {
        super(id, nome, idade, energia);
    }

    // Método viajar
    public void viajar() {

    }

    // Sobrescrevendo o método curar
    @Override
    public void curar() {

    }
}
