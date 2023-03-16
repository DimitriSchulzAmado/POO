public class Main {

    public static void main(String[] args) {
        Kart mario_kart = new Kart();
        Kart luide_kart = new Kart();
        Piloto piloto = new Piloto();

        mario_kart.piloto.nome = "Luide";
        mario_kart.piloto.vilao = true;

        luide_kart.piloto.nome = "Mario";
        luide_kart.piloto.vilao = false;

        mario_kart.piloto.soltaSuperPoder("fogo");
        luide_kart.soltaTurbo();
        luide_kart.piloto.soltaSuperPoder("banana");
        mario_kart.pular();
        luide_kart.piloto.soltaSuperPoder("banana");
        mario_kart.fazerDrift();
    }
}