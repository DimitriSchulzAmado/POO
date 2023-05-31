import core.utilities.Arquivo;
import core.utilities.Veiculo;
import presentation.controllers.ValorInvalidoException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Case 3 - order by year (Not solve yet)
public class Main {
    public static void main(String[] args) {
        // Instancia de lista de veiculos
        ArrayList<Veiculo> veiculos;
        // Criando um novo arquivo
        Arquivo arquivo = new Arquivo();
        // Instanciando scanner
        Scanner input = new Scanner(System.in);
        //flag para manter o fluxo
        boolean flag = true;
        // Opção do menu
        int option = 0;

        while (flag) {
            // Setando no arquivo a cada vez que passa
            veiculos = arquivo.ler();

            System.out.println("BEM VINDO MENU DE VEICULOS");
            System.out.println("1-Cadastrar veiculos");
            System.out.println("2-Mostrar as informações salvas no arquivo");
            System.out.println("3-Ordenar em ordem decrescete de ano");
            System.out.println("4-Veiculos de marca disponiveis em estoque");
            System.out.println("5-sair");
            option = input.nextInt();
            input.nextLine(); // Limpando o buffer

            switch (option) {
                case 1:
                    // Criando Veiculo
                    Veiculo veiculo = new Veiculo();

                    System.out.println("Modelo do veiculo: ");
                    veiculo.setModelo(input.nextLine());
                    try{
                        // Ver se a marca inserida está disponivel
                        System.out.println("Marca do veiculo: ");
                        veiculo.setMarca(input.nextLine());

                        if (!(veiculo.getMarca().equals("Rolls-Royce") || veiculo.getMarca().equals("Bentley")))
                            throw new ValorInvalidoException("Esta marca não está disponivel!!");

                        // Inserindo ano se estiver entre 1960 e 2024
                        System.out.println("Ano do veiculo: ");
                        veiculo.setAno(input.nextInt());

                        if(!(veiculo.getAno() >= 1960 && veiculo.getAno() <= 2024))
                            throw new ValorInvalidoException("Ano do veiculo fora do esperado!!");

                        // Inserindo se o km do veiculo for maior do que zero
                        System.out.println("Km do veiculo: ");
                        veiculo.setKmRodados(input.nextDouble());

                        if (!(veiculo.getKmRodados() >= 0))
                            throw new ValorInvalidoException("Quilometragem Errada!!!");

                    } catch (ValorInvalidoException e){
                        System.out.println(e);
                        break;
                    }

                    arquivo.escrever(veiculo);
                    break;
                case 2:
                    //armazena o retorno do medoto de leitura
                    ArrayList<Veiculo> autos = arquivo.ler();
                    // Mostra os dados de todos veiculos do arquivo
                    for (Veiculo auto : autos){
                        System.out.println("++ INFORMACOES DO VEICULO ++");
                        System.out.println(auto.getMarca());
                        System.out.println(auto.getModelo());
                        System.out.println(auto.getAno());
                        System.out.println(auto.getKmRodados());
                        System.out.println(auto.getMotor());
                    }
                    break;
                case 3:
                    // Ordenando veiculos em ordem decrescente de ano
                    Collections.sort(veiculos);
                    Collections.reverse(veiculos);
                    for (Veiculo auto : veiculos)
                        auto.mostrarInfos();
                    break;

                case 4:
                    // Armazena a quantidade de carros de cada marca
                    int rollsRoyce = 0;
                    int bentley = 0;

                    for (int i = 0; i < veiculos.size() ; i++) {
                        if (veiculos.get(i).getMarca().equals("Rolls-Royce"))
                            rollsRoyce++;
                        if (veiculos.get(i).getMarca().equals("Bentley"))
                            bentley++;
                    }
                    System.out.println("Quantidade de veiculos da marca Rolls-Royce: " + rollsRoyce);
                    System.out.println("Quantidade de veiculos da marca Bentley: " + bentley);
                    break;

                case 5:
                    flag = false; // Saindo do menu
                    break;
            }
        }
        input.close(); // Fechando a entrada de dados
    }
}