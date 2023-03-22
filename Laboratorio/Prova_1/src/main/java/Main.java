import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciando objetos
        Estante estante = new Estante(); // Estante onde ficarão os livros
        Scanner sc = new Scanner(System.in);
        boolean flag = true; // controlando o while flag

        while(flag) {
            System.out.println("*** MENU BIBLIOTECA ***");
            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Localizar livro na estante");
            System.out.println("3 - Informações do livro");
            System.out.println("4 - Ver a porcentagem de gêneros");
            System.out.println("5 - Livro com mais e menos páginas");
            System.out.println("6 - Sair");

            int escolha_menu = sc.nextInt();
            sc.nextLine();

            switch (escolha_menu) {
                case 1 -> {
                    // Criando o livro que será adicionado à estante de livros
                    System.out.println("Título do livro: ");
                    String titulo = sc.nextLine();
                    System.out.println("Gênero do Livro: ");
                    String genLiterario = sc.nextLine();
                    System.out.println("Quantidade de folhas: ");
                    int qtdFolhas = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Editora do livro: ");
                    String editora = sc.nextLine();

                    // Criando um livro
                    Livro livro = new Livro(titulo, genLiterario, qtdFolhas, editora);

                    // Adicionando livro à estante
                    estante.addLivro(livro);
                }
                case 2 -> estante.mostrarInfos(); // Mostra a localização exata do livro na estante
                case 3 -> estante.mostrarInfos();
                case 4 -> estante.porcentagemGen();
                case 5 -> estante.livroMaisEMenosPag();
                case 6 -> flag = false;
                default -> System.out.println("Invalid Action !!");
            }
        }

        sc.close(); // Fechando entrada de dados
    }
}
