public class Carrinho extends Brinquedo{

    public Carrinho(String modelo, String cor) {
        super(modelo, cor);
    }

    @Override
    public void mover(){
        super.mover();
        System.out.println("O carrinho ");
    }

    @Override
    public void ligar() {
        System.out.println("O Carrinho ");
        super.ligar();
    }

    @Override
    public void mostraInfo() {
        System.out.print("O Carrinho");
        super.mostraInfo();
    }
}
