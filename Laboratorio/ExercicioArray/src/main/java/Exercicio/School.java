package Exercicio;

public class School {
    // Atributos da escola
    String name;
    String address;
    String phoneNumber;
    String email;
    String year;

    // Atributo implicito de escola
    Student[] students = new Student[300];

    // Constructor
    public School(String name, String address, String phoneNumber, String email, String year) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.year = year;
    }

    public void addEstudante(Student stu) {

        for (int i = 0; i < students.length; i++) {
            // Verificar se as posiçoes estão vazias
            if (students[i] == null) {
                students[i] = stu;
                break;
            }
        }
    }

    public void mostraInfo() {
        System.out.println("NOME: " + this.name);
        System.out.println("ENDEREÇO: " + this.address);
        System.out.println("TELEFONE: " + this.phoneNumber);
        System.out.println("E-MAIL: " + this.email);
        System.out.println("ANO: " + this.year);

        for (int i = 0; i < students.length; i++) {
            // Verificar se as posiçoes estão vazias

            System.out.println("INFOS DA ESCOLA");
            if (students[i] != null) {
                students[i].mostraInfo();
            }
        }
    }

    public void qtdEstudanteAno() {
        int primeiroAno = 0;
        int segundoAno = 0;
        int terceiroAno = 0;

        for (int i = 0; i < students.length; i++) {
            // Verificar se as posiçoes estão vazias

            System.out.println("INFOS DA ESCOLA");
            if (students[i] != null) {
                if (students[i].year .equalsIgnoreCase("Primeiro")) {
                    primeiroAno++;
                }else if (students[i].year.equalsIgnoreCase("Segundo")) {
                    segundoAno++;
                }else {
                    terceiroAno++;
                }
            }
        }
        System.out.println("Quantidade de alunos por ano");
        System.out.println("1º ANO: "+primeiroAno);
        System.out.println("2º ANO: "+segundoAno);
        System.out.println("3º ANO: "+terceiroAno);
    }
}
