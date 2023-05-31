package core.utilities;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    // Métodos que podemos realizar com o arquivo
    public void escrever(Livro livro){

        // Instanciando os objetos que permitirão a escrita de dados
        OutputStream os = null; // Fluxo entrada
        OutputStreamWriter osw = null; // Gerador de fluxo de entrada
        BufferedWriter bw = null; // Buffer de entrada

        try{
            // Abrindo a saida de dados
            os = new FileOutputStream("livros.txt", true); // Nome do arquivo onde sera salvo
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            // Flag que indica onde começa as informações do livro
            bw.write("++ livro ++\n");
            bw.write(livro.getNome() + "\n");
            bw.write(livro.getAutor() + "\n");
            bw.write(livro.getEditora() + "\n");
            bw.write(livro.getQtdPaginas() + "\n");
        } catch (Exception e) {
            System.out.println("ERRO: " + e);
        } finally {
            // Fechando a entrada de dados
            try {
                bw.close();
            } catch (Exception e) {}
        }
    }

    public ArrayList<Livro> ler(){

        // ArrayList auxiliar para salvar livros encontrados no arquivo
        ArrayList<Livro> encontreiNoArquivo = new ArrayList<>();

        // Variável auxiliar que servirá de flag para o while
        String linhaLer;

        // Classes que permitem leitura de dados do arquivo
        InputStream is = null; // Fluxo saida
        InputStreamReader isr = null; // Gerador do fluxo de saida
        BufferedReader br = null; // Buffer de saida

        try {
            is = new FileInputStream("livros.txt"); // Nome do arquivo onde sera salvo
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Colocando o cursor no inicio do arquivo
            linhaLer = br.readLine();
            while (linhaLer != null) {
                // Comparando se o que está em linhaLer é igual a minha flag
                if (linhaLer.contains("++ Livro ++")) {
                    // Variável auxiliar de livros
                    Livro livro1 = new Livro();
                    livro1.setNome(br.readLine());
                    livro1.setAutor(br.readLine());
                    livro1.setEditora(br.readLine());
                    livro1.setQtdPaginas(Integer.parseInt(br.readLine()));

                    // Adicionando o livro no array
                    encontreiNoArquivo.add(livro1);
                }
                linhaLer = br.readLine();
            }
        } catch (Exception e){
            System.out.println("ERRO: " + e);
        } finally {
            try {
                br.close();
            } catch (Exception e) {}
        }

        return encontreiNoArquivo;
    }
}
