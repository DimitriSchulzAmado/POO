package br.inatel.brownie;

public class BrownieNutella extends Brownie{

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaNutella() {
        System.out.println("Adicionando mais Nutella ao Brownie " + super.nome);
    }

    @Override
    public void addCarrinhoDeCompras() {
        super.addCarrinhoDeCompras();
        System.out.println("Brownie de Nutella ja dá pra comprar!!");
    }
}
