package presentation.models;

import presentation.controllers.NotFoundSocialMediaException;
import presentation.models.abstracts.RedeSocial;
import presentation.views.Facebook;
import presentation.views.GooglePlus;
import presentation.views.Instagram;
import presentation.views.Twitter;

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
        for (RedeSocial redeSocial : redesSociais) {
            if (redeSocial instanceof Twitter) {
                ((Twitter) redeSocial).postarFoto();
                ((Twitter) redeSocial).postarVideo();
                ((Twitter) redeSocial).postarComentario();
            } else if (redeSocial instanceof GooglePlus) {
                redeSocial.curtirPublicacao();
                ((GooglePlus) redeSocial).fazStreaming();
                ((GooglePlus) redeSocial).compartilhar();
            } else if (redeSocial instanceof Facebook) {
                ((Facebook) redeSocial).postarFoto();
                ((Facebook) redeSocial).postarVideo();
                ((Facebook) redeSocial).postarComentario();
            } else if (redeSocial instanceof Instagram) {
                ((Instagram) redeSocial).postarFoto();
                ((Instagram) redeSocial).postarVideo();
                ((Instagram) redeSocial).postarComentario();
            } else {
                throw new NotFoundSocialMediaException("Rede social inválida");
            }
        }
    }
}

