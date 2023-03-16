package Exercicio;

public class Escola {
    // Atributos da escola
    String nome;
    String endereco;
    String numTelefone;
    String email;
    String ano;

    // Atributo implicito de escola
    Estudante[] estudantes = new Estudante[300];

    public Escola(String nome, String endereco, String numTelefone, String email, String ano) {
        this.nome = nome;
        this.endereco = endereco;
        this.numTelefone = numTelefone;
        this.email = email;
        this.ano = ano;
    }

    public void addEstudante(Estudante e) {

        for (int i = 0; i < estudantes.length; i++) {
            // Verificar se as posiçoes estão vazias
            if (estudantes[i] == null) {
                estudantes[i] = e;
                break;
            }
        }
    }

    public void mostraInfo() {
        System.out.println("NOME: " + this.nome);
        System.out.println("ENDEREÇO: " + this.endereco);
        System.out.println("TELEFONE: " + this.numTelefone);
        System.out.println("E-MAIL: " + this.email);
        System.out.println("ANO: " + this.ano);

        for (int i = 0; i < estudantes.length; i++) {
            // Verificar se as posiçoes estão vazias

            System.out.println("INFOS DA ESCOLA");
            if (estudantes[i] != null) {
                estudantes[i].mostraInfo();
            }
        }
    }

    public void qtdEstudanteAno() {
        int primeiroAno = 0;
        int segundoAno = 0;
        int terceiroAno = 0;

        for (int i = 0; i < estudantes.length; i++) {
            // Verificar se as posiçoes estão vazias

            System.out.println("INFOS DA ESCOLA");
            if (estudantes[i] != null) {
                if (estudantes[i].ano.equalsIgnoreCase("Primeiro")) {
                    primeiroAno++;
                }else if (estudantes[i].ano.equalsIgnoreCase("Segundo")) {
                    segundoAno++;
                }else {
                    terceiroAno++;
                }
            }
        }
    }
}
