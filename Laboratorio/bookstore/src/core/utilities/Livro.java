package core.utilities;

public class Livro implements Comparable<Livro>{
    private String nome;
    private String autor;
    private String editora;
    private int qtdPaginas;

    public void mostraInfo(){
        System.out.println("++ Informações do Livro ++");
        System.out.println("Nome: " + this.nome);
        System.out.println();
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    @Override
    public int compareTo(Livro livro) {
        return Integer.compare(this.qtdPaginas, livro.getQtdPaginas());
    }
}
