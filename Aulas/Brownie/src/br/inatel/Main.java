package br.inatel;

import br.inatel.comprador.Comprador;
import br.inatel.brownie.BrownieCafe;
import br.inatel.brownie.BrownieNutella;
import br.inatel.brownie.BrownieDoceDeLeite;
public class Main {
    public static void main(String[] args) {

        BrownieCafe bwCafe = new BrownieCafe("Brownie de Café", 10, "Café");
        BrownieNutella bwNutella =
                new BrownieNutella("Brownie de Nutella", 70, "Nutella");
        BrownieDoceDeLeite bwDoceLeite =
                new BrownieDoceDeLeite("Brownie Doce de Leite", 15, "Doce de leite");

        // Instanciando um comprador
        Comprador comprador = new Comprador("Jorgin", 300);

        comprador.efetuarCompra(bwCafe);
        comprador.efetuarCompra(bwNutella);
        comprador.efetuarCompra(bwDoceLeite);

    }
}
