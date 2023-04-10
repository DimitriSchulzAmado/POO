package br.inatel.first.ModificadoresDeAcesso;

public class Main {
    public static void main(String[] args) {
        // Criando dois objetos de funcionario
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        // Preenchendo o nome dos funcionarios
        f1.setNome("Gabriel");
        f2.setNome("Marcos");

        f1.mostraInfo();
        f2.mostraInfo();

        // Para mostrar o item de dentro da classe estática pública:
        // System.out.println("Quantidade de funcionarios na empresa: " + br.inatel.modificadoresDeAcesso.Funcionario.contaFuncionarios);
    }
}
