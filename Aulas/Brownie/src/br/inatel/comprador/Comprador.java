package br.inatel.comprador;

import br.inatel.brownie.Brownie;

public class Comprador {
    private String nome;
    private double saldo;

    // Construtor da classe
    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    // Método próprio da classe
    public void efetuarCompra(Brownie brownie) {
        brownie.addCarrinhoDeCompras();
        brownie.calculaValorTotalCompra();
        System.out.println("O comprador " + this.nome + " fez uma compra de: " + this.saldo + " reais");
    }
}
