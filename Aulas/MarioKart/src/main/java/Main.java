public class Main {

    public static void main(String[] args) {
        Kart kart = new Kart();
        Kart kart2 = new Kart();
        Piloto piloto = new Piloto();
        Piloto piloto2 = new Piloto();
        
        piloto2.nome = "Luide";
        kart2.nome = "cartLuide";
        piloto2.vilao = true;

        piloto.nome = "Mario";
        kart.nome = "cartMario";
        piloto.vilao = false;

        kart.motor.cilindrada = "50";
        kart2.motor.cilindrada = "150";
        kart.motor.velocidadeMaxima = 200F;
        kart2.motor.velocidadeMaxima = 50F;

        piloto.soltaSuperPoder("fogo");
        kart2.soltaTurbo();
        piloto2.soltaSuperPoder("banana");
        kart.pular();
        piloto.soltaSuperPoder("banana");
        kart.fazerDrift();
    }
}