package br.inatel.brownie;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras() {
        System.out.println("Adicionado ao carrinho de compras: " + this.nome);
    }

    public void calculaValorTotalCompra() {
        System.out.println("O valor total da compra de um " + this.nome + " é de " + this.preco);
    }

    public void mostraInfo() {
        System.out.println("Bronwnies");
    }
}
