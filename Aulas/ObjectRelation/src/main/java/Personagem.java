public class Personagem {

    String nome;
    int pontos; // Pontos de vida
    Arma arma;

    public void usarArma() {
        arma.resistencia -= 2;
    }

    public void tomarDano() {
        pontos -= 5;


    }
}
