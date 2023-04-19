package br.inatel.personagens;

public class Cidade {

    // Atributo
    private String nome; // Nome da cidade

    // Preparando para instanciar a classe personagem
    private Personagem [] personagens = new Personagem[100];

    // Agregação
    Arma arma; // Humano pode ter uma arma ou não

    // Método para criação de um novo personagem
    public void adicionarPersonagem(Personagem p) {
        for (int i = 0; i < personagens.length; i++) {
            if(personagens[i] == null) {
                personagens[i] = p;
                break;
            }
        }
    }

    // Método para listar todos os personagens
    public void listarPersonagens() {
        for(int i=0;i<personagens.length;i++) {
            // Verifica se está vazio
            if (personagens[i] != null) {
                if (personagens[i] instanceof Humano) {
                    // Realizando casting para Humano
                    Humano auxHumano = (Humano) personagens[i];
                    auxHumano.mostrarInfos();
                    auxHumano.addArma(arma);
                    auxHumano.modificarArma();
                    arma.setTipoArma("Metralhadora");
                    arma.setForca(190);
                    auxHumano.defender();
                    auxHumano.modificarHabilidades(2, "Correr");
                    auxHumano.atacar();
                }
                else if (personagens[i] instanceof Zumbi) {
                    // Realizando casting para Zumbi
                    Zumbi auxZumbi = (Zumbi) personagens[i];
                    auxZumbi.mostrarInfos();
                    auxZumbi.transformacao();
                    auxZumbi.atacar();
                    auxZumbi.infectou();
                    auxZumbi.defender();
                }
            }
        }
    }
}
