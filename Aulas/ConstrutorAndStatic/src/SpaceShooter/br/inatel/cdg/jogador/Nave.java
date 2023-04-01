package SpaceShooter.br.inatel.cdg.jogador;

import SpaceShooter.br.inatel.cdg.inimigo.Asteroide;

public class Nave {
    private String nome;
    private int vida;
    private String tipoTiro;

    public Nave(String nome, int vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atira(Asteroide ast){

    }
}
