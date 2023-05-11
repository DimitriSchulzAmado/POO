package tryCatch;

import exceptions.SaldoInsuficienteException;

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

        // Para fazer o metodo sacar() é obrigatório fazer o try/catch por conta do "throws" da classe Conta
        try {
            conta.sacar(10000);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim da Main");
    }
}
