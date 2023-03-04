package org.example;

public class Zumbi {

    double vida;
    String nome;

    double mostraVida() {
        System.out.println("A vida do zumbi é: " + vida);
        return 0;
    }

    public boolean transfereVida(Zumbi zumbialvo, double quantia) {

        if(vida > quantia) {
            vida -= quantia;
            zumbialvo.vida += quantia;

            System.out.println("A transferência foi concluida!\n" +
                    "zumbi esta com " + zumbialvo.vida + " de vida."
            );
            return true;
        }else {
            System.out.println("Ação invalida");
            return false;
        }
    }
}
