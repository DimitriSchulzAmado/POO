package main;

import interfaces.Compartilhamento;
import interfaces.VideoConferencia;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {
    // Herdando da superclasse
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    // Sobrescrevendo o método da superclasse
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Facebook!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Fez um comentário no Facebook!");
    }

    // Sobrescrevendo os métodos das Interfaces
    @Override
    public void Compartilhar() {
        System.out.println("Compartilhou algo no Facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma vídeo conferência no Facebook!");
    }
}
