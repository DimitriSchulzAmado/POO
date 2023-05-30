package models;

import controllers.errors.NotFoundSocialMediaException;
import models.abstracts.RedeSocial;
import views.Facebook;
import views.GooglePlus;
import views.Instagram;
import views.Twitter;

public class Usuario {
    private String nome;
    private String email;
    public RedeSocial[] redesSociais;

    // Construtor
    public Usuario(String nome, String email, RedeSocial[] redesSociais) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = redesSociais;
    }

    // Mostrando informações/ações do usuario em determinada rede social e tratando erro
    public void mostraInfoRedeSocial() throws NotFoundSocialMediaException {
        for (int i = 0; i < redesSociais.length; i++) {
            if(redesSociais[i] instanceof Twitter) {
                ((Twitter) redesSociais[i]).postarFoto();
                ((Twitter) redesSociais[i]).postarVideo();
                ((Twitter) redesSociais[i]).postarComentario();
            } else if(redesSociais[i] instanceof GooglePlus) {
                redesSociais[i].curtirPublicacao();;
                ((GooglePlus) redesSociais[i]).fazStreaming();
                ((GooglePlus) redesSociais[i]).compartilhar();
            } else if(redesSociais[i] instanceof Facebook) {
                ((Facebook) redesSociais[i]).postarFoto();
                ((Facebook) redesSociais[i]).postarVideo();
                ((Facebook) redesSociais[i]).postarComentario();
            } else if(redesSociais[i] instanceof Instagram) {
                ((Instagram) redesSociais[i]).postarFoto();
                ((Instagram) redesSociais[i]).postarVideo();
                ((Instagram) redesSociais[i]).postarComentario();
            } else {
                throw new NotFoundSocialMediaException("Rede social inválida");
            }
        }
    }
}
