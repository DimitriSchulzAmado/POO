import br.inatel.personagens.Cidade;
import br.inatel.personagens.Humano;
import br.inatel.personagens.Personagem;
import br.inatel.personagens.Zumbi;

public class Main {
    public static void main(String[] args) {
        // Instanciando personagens
        Humano humano = new Humano(100, 1);
        Zumbi zumbi = new Zumbi(50, 2);
        Cidade cidade = new Cidade();

        // Adicionando personagens
        cidade.adicionarPersonagem(humano);
        cidade.adicionarPersonagem(zumbi);

        // Preenchendo atributos
        humano.setNome("John");
        humano.setIdade(45);
        humano.setVagalume(false);
        humano.setEnergia(150F);
        humano.setDistanciaEscuta(100);

        zumbi.setDiasInfeccao(365);


    }
}
