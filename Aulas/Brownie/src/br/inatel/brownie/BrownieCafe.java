package br.inatel.brownie;

import br.inatel.brownie.Brownie;

public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaCafe() {
        System.out.println("Adicionando mais café ao Brownie " + super.nome);
    }

    @Override
    public void addCarrinhoDeCompras() {
        super.addCarrinhoDeCompras();
        System.out.println("Brownie dos amantes de café ja está no carrinho!!");
    }
}
