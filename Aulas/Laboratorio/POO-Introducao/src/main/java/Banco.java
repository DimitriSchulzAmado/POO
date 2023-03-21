public class Banco {
    // Atributos explicitos do banco
    String nome; // Nome do banco
    String endereco; // Endereço do banco
    /*
    Associações :
    Agregação : Parte faz sentido existir sem o tod0
    Composição: Parte não faz sentido existir sem o tod0
     */

    // Agregando a classe de Cliente
    Cliente cliente; // Agregação
    Investimento conta;

    public Banco(){
        conta = new Investimento(); // Composição
    }

    // Métodos
    void mostraInfos(){
        System.out.println("Nome do banco: "+nome);
        System.out.println("Endereço do banco: "+endereco);
        conta.mostraInfos();
        cliente.mostraInfos();
    }

    void adicionaClientes(Cliente c){
        cliente = c;
    }

}