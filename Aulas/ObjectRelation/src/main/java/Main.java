public class Main {

    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        Arma faca = new Arma();


        personagem.nome = "Dimitri";
        personagem.pontos = 100;
        faca.resistencia = 999;
        personagem.arma = faca; // Setar a arma no personagem

        personagem.tomarDano();
        personagem.usarArma();

        faca.mostraInfoArma();
    }
}
