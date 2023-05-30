import controllers.errors.NotFoundSocialMediaException;
import models.abstracts.RedeSocial;
import models.Usuario;
import views.GooglePlus;
import views.Instagram;

public class Main {
    public static void main(String[] args) {
        // Instanciando todas redes sociais
        final RedeSocial[] redesSociais = new RedeSocial[2];
        final RedeSocial redeSocial1 = new Instagram("testando123", 2);
        final RedeSocial redeSocial2 = new GooglePlus("teste",4);

        redesSociais[0] = redeSocial1;
        redesSociais[1] = redeSocial2;

        // Instanciando Usuario
        final Usuario usuario = new Usuario("Dimitri", "dimitri.schulz@ges.inatel.br", redesSociais);

        // Mostrando informações/ações
        try {
            usuario.mostraInfoRedeSocial();
        } catch (NotFoundSocialMediaException e) {
            e.printStackTrace();
        }
    }
}
