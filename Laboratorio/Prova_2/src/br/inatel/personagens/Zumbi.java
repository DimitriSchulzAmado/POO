package br.inatel.personagens;

import br.inatel.interfaces.Infectar;
import br.inatel.interfaces.Lutar;

public class Zumbi extends Personagem implements Infectar, Lutar {
    // Atributos
    private int diasInfeccao; // Qtd de dias que está infectado
    private boolean cego; // Se é cego ou não

    // Construtor da Superclasse
    public Zumbi(int vida, int idPersonagem) {
        super(vida, idPersonagem);
    }


    public void transformacao() {
        if (diasInfeccao >= 2 && diasInfeccao < 14) {
            System.out.println("Esse zumbi é um Corredor");
            this.cego = false;
        } else if (diasInfeccao >= 14 && diasInfeccao < 365) {
            System.out.println("Esse zumbi é um Perseguidor");
            this.cego = false;
        } else {
            System.out.println("Esse zumbi é um Estalador");
            this.cego = true;
        }
    }

    // Sobrescrevendo o método
    @Override
    public void mostrarInfos() {
        super.mostrarInfos();
        System.out.println("Dias de infeccao " + this.diasInfeccao);
        
    }

    // Sobrescrevendo Interface
    @Override
    public void infectou() {
        System.out.println("O zumbi mordeu e infectou um humano");
    }

    @Override
    public void atacar() {
        System.out.println();
    }

    @Override
    public void defender() {
        System.out.println("O zumbi se defendeu");
    }

    // Setter
    public void setDiasInfeccao(int diasInfeccao) {
        this.diasInfeccao = diasInfeccao;
    }
}
