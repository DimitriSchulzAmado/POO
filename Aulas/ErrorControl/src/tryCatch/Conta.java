package tryCatch;

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
}
