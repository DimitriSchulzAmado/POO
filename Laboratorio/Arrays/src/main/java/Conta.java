public class Conta {
    float saldoDaConta;
    String numConta;

    // Construtor da classe
    public Conta(float saldo, String numero){
        System.out.println("+++ Conta Criada +++");
        this.saldoDaConta = saldo;
        this.numConta = numero;
    }

    // Método para mostrar as informações
    public void mostraInfos(){
        System.out.println("Informações da conta");
        System.out.println("Saldo: " + this.saldoDaConta);
        System.out.println("Número da conta " + this.numConta);
    }
}
