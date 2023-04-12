public class Barco extends Brinquedo{
    public Barco(String modelo, String cor) {
        super(modelo, cor);
    }

    @Override
    public void mover(){
        System.out.println("O barco " + this.getModelo() + " está se movendo pela água");
    }

    @Override
    public void ligar() {
        System.out.println("O capitão ligou o(s) motor(es) do barco");
    }

    @Override
    public void mostraInfo() {
        System.out.print("O barco ");
        super.mostraInfo();

        System.out.println("\n-----------------------------------------------");
    }
}
