package tryCatch;

import exceptions.SaldoInsuficienteException;
import java.util.HashSet;

public class Conta {
    private float saldo;
    private float limite;

    HashSet<Cliente> clientes = new HashSet<>();
    public Conta(float saldo, float limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void mostraInfo(){
        for (Cliente infos : clientes) {
            try {
                System.out.println(infos.getNome());
                System.out.println(infos.getCpf());
            }catch (NullPointerException e){
                System.out.println("Erro" + e);
            }
        }
    }

    // Método que obriga a tratar a exception(checked) prevista caso o valor seja fora da condição
    public void sacar(double quantidade) throws SaldoInsuficienteException {
        if (quantidade <= (this.saldo + this.limite)){
            this.saldo -= quantidade;
        }else {
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
    }
}
