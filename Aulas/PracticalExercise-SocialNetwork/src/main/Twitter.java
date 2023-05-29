package main;

import interfaces.Compartilhamento;

public class Twitter extends RedeSocial implements Compartilhamento {
    // Herdando da superclasse
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    // Sobrescrevendo o método da superclasse
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Fez um comentário no Tweet!");
    }

    // Sobrescrevendo o método da Interface
    @Override
    public void Compartilhar() {
        System.out.println("Realizou um Tweet!");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.print(" no Twitter!");
    }
}
