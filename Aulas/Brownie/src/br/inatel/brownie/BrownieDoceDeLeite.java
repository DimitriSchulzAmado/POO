package br.inatel.brownie;

import br.inatel.brownie.Brownie;

public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite() {
        System.out.println("Adicionando mais doce de leite ao Brownie " + super.nome);

    }

    @Override
    public void addCarrinhoDeCompras() {
        super.addCarrinhoDeCompras();
        System.out.println("Brownie de mineiro te espera!!");
    }
}
