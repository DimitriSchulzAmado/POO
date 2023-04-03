public class Estante {
    // Atributos Explicitos
    char letra; // Letra que identifica a estante
    int idEstante; // ID da estante
    // Atributos Implicitos
    Livro[] livros = new Livro[120]; // Array de livros

    // Construtor da classe estante
    public Estante(char letra, int idEstante) {
        this.letra = letra;
        this.idEstante = idEstante;
    }

    // Métodos da estante
    // 1. Método para mostrar informações do livro e da estante
    public void mostrarInfos(){
        System.out.println("Letra: " + this.letra);
        System.out.println("ID: " + this.idEstante);
        System.out.println("*** INFOS DO LIVRO ***");
        for (int i = 0; i < livros.length; i++) {
            if(livros[i]!=null){
                livros[i].mostrarInfos();
            }
        }
    }

    // 2. Método para adicionar livros à estante
    public void addLivro(Livro livro){
        for (int i = 0; i < livros.length; i++) {
            // Verifica se a posição está vazia
            if (livros[i] == null){
                livros[i] = livro; // Adicionando o livro ao array
                break; // Para a sobreposição
            }
        }
    }
    
    // 3. Método que calcula a porcentagem de gêneros
    public void porcentagemGen(){
        // Variáveis locais para contagem da qtd de livro de cada gênero
        int contaDrama = 0;
        int contaSuspense = 0;
        int contaOutros = 0;
        int qtdLivrosEstante = 0;

        // Percorrendo o array de livros
        for (int i = 0; i < livros.length; i++) {
            if(livros[i] != null){
                // Verificando o gen Literário dos livros
                if(livros[i].genLiterario.equalsIgnoreCase("Drama")){
                    contaDrama++; // Incrementei contador de drama
                } else if (livros[i].genLiterario.equalsIgnoreCase("Suspense")) {
                    contaSuspense++; // Incrementei contador de suspense
                } else
                    contaOutros++; // Incrementando contador de outros gêneros

                qtdLivrosEstante++; // Incrementando a contagem de livros
            }
        }
        // Apresentando as informações relativas a porcentagem de livros da estante
        System.out.println("Drama: " + ((double)(contaDrama / qtdLivrosEstante)*100 + "%"));
        System.out.println("Suspense: " + ((double)(contaSuspense / qtdLivrosEstante)*100 + "%"));
        System.out.println("Outros: " + ((double)(contaOutros / qtdLivrosEstante)*100 + "%"));
    }

    public void livroMaisEMenosPag(){
        int maior = 0;
        int menor = 99999;
        int posMaior=0; // Armazena a posição onde está o livro com mais páginas
        int posMenor=0; // Armazena a posição onde está o livro com menos páginas

        for (int i = 0; i < livros.length; i++) {
            // Mais páginas
            if (livros[i].qtdFolhas > maior) {
                posMaior = i;
                maior = livros[i].qtdFolhas;
            }
            // Menos páginas
            if (livros[i].qtdFolhas < menor){
                posMenor = i;
                menor = livros[i].qtdFolhas;
            }
        }

        // Mostrando informações
        if(posMaior==0 && posMenor==0){
            System.out.println("Não há informações de livros cadastrados");
        }else{
            // Apresentando as informações dos livros
            System.out.println("Livros mais páginas");
            livros[posMaior].mostrarInfos();
            System.out.println("Livro menos páginas");
            livros[posMenor].mostrarInfos();
        }
    }
}
