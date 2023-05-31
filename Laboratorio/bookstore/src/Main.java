import core.utilities.Arquivo;
import core.utilities.Livro;
import presentation.controllers.InfoInvalidaException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Livro> livros;
        Arquivo arquivo = new Arquivo();
        
        int linhaLer = 0; // Variavel auxiliar

        Scanner sc = new Scanner(System.in);

        boolean flag = true; // Controladora While
        int opcao = 0; // Opção do menu

        while (flag) {
            livros = arquivo.ler();

            System.out.println("BEM VINDO MENU DE LIVROS");
            System.out.println("1-Cadastrar Livros");
            System.out.println("2-Listar livros");
            System.out.println("3-Ordenar em ordem crescete");
            System.out.println("4-Ordenar em ordem decrescete");
            System.out.println("5-Livros com a editora Leya");
            System.out.println("6-sair");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpando o buffer

            switch (opcao) {
                case 1:
                    // Criando Livro
                    Livro livro = new Livro();
                    System.out.println("Nome do livro: ");
                    livro.setNome(sc.nextLine());
                    System.out.println("Autor do livro: ");
                    livro.setAutor(sc.nextLine());
                    try{
                        System.out.println("Editora do livro: ");
                        livro.setEditora(sc.nextLine());

                        if (!(livro.getEditora().equals("Leya") || livro.getEditora().equals("Arqueiro") || livro.getEditora().equals("Rocco") )){
                            throw new InfoInvalidaException("Editora errada!!!");

                        }
                        System.out.println("Quantidade de páginas");
                        livro.setQtdPaginas(sc.nextInt());

                        if(livro.getQtdPaginas() < 0)
                            throw new InfoInvalidaException("A quantidade de pagina não pode ser negativa!");
                    }catch (InfoInvalidaException e){
                        break;
                    }
                    sc.nextLine(); // Limpando o buffer

                    arquivo.escrever(livro);
                    break;
                case 2:
                    for (int i = 0; i < livros.size() ; i++)
                        livros.get(i).mostraInfo();
                    break;
                case 3:
                    Collections.sort(livros);

                    for (Livro book : livros)
                        book.mostraInfo();
                    break;
                case 4:
                    Collections.sort(livros);
                    Collections.reverse(livros);
                    for (Livro book : livros)
                        book.mostraInfo();
                    break;

                case 5:
                    for (int i = 0; i < livros.size() ; i++)
                        if (livros.get(i).getEditora().equals("Leya"))
                            linhaLer++;
                    System.out.println("Quantidade de livros com a editora Leya: " + linhaLer);
                    break;

                default:
                    flag = false; // Saindo do menu
                    break;
            }
        }
        sc.close(); // Fechando a entrada de dados
    }
}