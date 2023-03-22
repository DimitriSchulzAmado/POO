public class Livro {

    String titulo;
    String genLiterario;
    int qtdFolhas;
    String editora;

    public Livro(String titulo, String genLiterario, int qtdFolhas, String editora) {
        this.titulo = titulo;
        this.genLiterario = genLiterario;
        this.qtdFolhas = qtdFolhas;
        this.editora = editora;
        Autor autor = new Autor();
    }

    public void mostrarInfos(){
        System.out.println("*** Informações do Livro ***");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Gênero Literário: " + this.genLiterario);
        System.out.println("Quantidade de Folhas: " + this.qtdFolhas);
        System.out.println("Editora: " + this.editora);
    }
}
