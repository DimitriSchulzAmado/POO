public class Livro {
    // Atributos do livro - Explicitos
    String titulo; // Título do livro
    String editora; // Editora do livro
    String genLiterario; // Gênero literário do livro
    int qtdFolhas; // Quantidade de paginas do livro

    // Atributos do livro - Implicito
    Autor autor; // Referência para o meu autor

    // Construtor da classe Livro
    public Livro() {
        this.autor = new Autor(); // Finaliza a composição entre livro e autor
    }

    // Métodos da classe de Livro
    public void mostrarInfos(){
        System.out.println("*** Informações do Livro ***");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Editora: " + this.editora);
        System.out.println("Gênero Literário: " + this.genLiterario);
        System.out.println("Quantidade de Folhas: " + this.qtdFolhas);
        // Mostrando as informações do autor
        autor.mostrarInfos();
    }
}
