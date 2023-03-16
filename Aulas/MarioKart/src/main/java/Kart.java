public class Kart {
    Piloto piloto; // agregação
    Motor motor; // Composição

    String nome;

    // Construtor
    public Kart() {
        motor = new Motor(); // Fazendo a composição
    }

    public void pular(){
        System.out.println("Desviado");
    }

    public void soltaTurbo(){
        motor.velocidadeMaxima = 150;
        System.out.println("Velocidade maxima!!!");
    }

    public void fazerDrift(){
        motor.velocidadeMaxima = 50;
        System.out.println("Velocidade abaixou por conta do drift");
    }
}
