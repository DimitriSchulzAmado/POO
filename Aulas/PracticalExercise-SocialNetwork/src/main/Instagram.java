package main;

public class Instagram extends RedeSocial {
    // Herdando da superclasse
    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    // Sobrescrevendo metodos da superclasse
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Istagram!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Istagram!");
    }

    @Override
    public void postarComentario() {
        System.out.println("comentou no Istagram!");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.print(" no Instagram!");
    }
}
