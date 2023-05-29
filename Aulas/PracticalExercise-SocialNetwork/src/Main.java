import main.RedeSocial;
import main.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciando todas redes sociais
        RedeSocial[] redesSociais = new RedeSocial[2];

        // Instanciando Usuario
        Usuario usuario = new Usuario(redesSociais);
    }
}
