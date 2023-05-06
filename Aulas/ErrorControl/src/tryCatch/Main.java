package tryCatch;

public class Main {
    public static void main(String[] args) {

        // Instanciando clientes
        Cliente cliente = new Cliente("Tio", 4321);
        Cliente cliente2 = new Cliente("Tia", 1234);
        Cliente cliente3 = null;

        // Instanciando conta
        Conta conta = new Conta(1500, 6000);

        // Adicionando clientes
        conta.addCliente(cliente);
        conta.addCliente(cliente2);
        conta.addCliente(cliente3);

        // Mostrando informações
        conta.mostraInfo(); // deu erro NullPointerException

        System.out.println("Fim da Main");
    }
}
