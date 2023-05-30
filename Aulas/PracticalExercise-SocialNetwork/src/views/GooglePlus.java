package views;

import models.interfaces.Compartilhamento;
import models.interfaces.VideoConferencia;
import models.abstracts.RedeSocial;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    // Herdando da superclasse

    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    // Sobrescrevendo o método da superclasse
    @Override
    public void postarFoto() {
        System.out.println("Impossivel postar fotos no GooglePlus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Impossivel postar vídeos no GooglePlus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Impossivel fazer comentários no GooglePlus!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Um dado foi compartilhado no GooglePlus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Iniciou uma vídeo conferência no GooglePlus");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println(" no GooglePlus!");
    }
}
