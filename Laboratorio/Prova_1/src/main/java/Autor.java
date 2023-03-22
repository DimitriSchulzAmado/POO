public class Autor {
    String nome;
    int anoNascimento;
    String profissao;

    public void mostrarInfos(){
        System.out.println("*** Informações do Autor ***");
        System.out.println("Autor: " + this.nome);
        System.out.println("Data de Nascimento: " + this.anoNascimento);
        System.out.println("Profissão: " + this.profissao);
    }
}
