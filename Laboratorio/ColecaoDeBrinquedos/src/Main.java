public class Main {
    public static void main(String[] args) {
        // Instanciando a coleção
        ColecaoDeBrinquedos colecao = new ColecaoDeBrinquedos();

        // Criando objetos
        Brinquedo carrinho = new Carrinho("Uno Escada", "Branco");
        Brinquedo aviao = new Aviao("Teco Teco", "Amarelo", 2);
        Brinquedo barco = new Barco("Bote", "Laranja");

        // Adicionando Brinquedos
        colecao.adicionarBrinquedos(carrinho);
        colecao.adicionarBrinquedos(aviao);
        colecao.adicionarBrinquedos(barco);

        //Listando todos os brinquedos
        System.out.println("Lista de Brinquedos: ");
        colecao.listarBrinquedos();
    }
}
