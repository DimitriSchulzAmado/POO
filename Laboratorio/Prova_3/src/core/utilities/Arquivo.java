package core.utilities;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    // Métodos que podemos realizar com o arquivo
    public void escrever(Veiculo veiculo){
        // Instanciando os objetos que permitirão a escrita de dados
        OutputStream os = null; // Fluxo entrada
        OutputStreamWriter osw = null; // Gerador de fluxo de entrada
        BufferedWriter bw = null; // Buffer de entrada

        try{
            // Abrindo a saida de dados
            os = new FileOutputStream("veiculos.txt", true); // Nome do arquivo onde sera salvo
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            // Flag que indica onde começa as informações do Veiculo
            bw.write("++ Veiculo ++\n");
            bw.write(veiculo.getMarca() + "\n");
            bw.write(veiculo.getModelo() + "\n");
            bw.write(veiculo.getAno() + "\n");
            bw.write(veiculo.getKmRodados() + "\n");
            bw.write(veiculo.getMotor() + "\n");
        } catch (Exception e) {
            System.out.println("ERRO: " + e);
        } finally {
            // Fechando a entrada de dados
            try {
                bw.close();
            } catch (Exception e) {}
        }
    }

    public ArrayList<Veiculo> ler(){
        // ArrayList auxiliar para salvar livros encontrados no arquivo
        ArrayList<Veiculo> encontreiNoArquivo = new ArrayList<>();

        // Variável auxiliar que servirá de flag para o while
        String linhaLer;

        // Classes que permitem leitura de dados do arquivo
        InputStream is = null; // Fluxo saida
        InputStreamReader isr = null; // Gerador do fluxo de saida
        BufferedReader br = null; // Buffer de saida

        try {
            is = new FileInputStream("veiculos.txt"); // Nome do arquivo onde sera salvo
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Colocando o cursor no inicio do arquivo
            linhaLer = br.readLine();
            while (linhaLer != null) {
                // Comparando se o que está em linhaLer é igual a minha flag
                if (linhaLer.contains("++ Veiculo ++")) {
                    // Variável auxiliar de veiculos
                    Veiculo veiculo1 = new Veiculo();
                    veiculo1.setMarca(br.readLine());
                    veiculo1.setModelo(br.readLine());
                    veiculo1.setAno(Integer.parseInt(br.readLine()));
                    veiculo1.setKmRodados(Double.parseDouble(br.readLine()));

                    // Adicionando o veiculo no array
                    encontreiNoArquivo.add(veiculo1);
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
