public class Aviao extends Brinquedo {
    private int qtdMotores;
    public Aviao(String modelo, String cor, int qtdMotores) {
        super(modelo, cor);
        this.qtdMotores = qtdMotores;
    }

    @Override
    public void mover() {
        System.out.println("O Avião " + this.getModelo() + " está se movendo pelo ar");
    }

    @Override
    public void ligar() {
        System.out.println("O piloto checou tudo e ligou os motores");
    }

    @Override
    public void mostraInfo() {
        System.out.print("O Avião ");
        super.mostraInfo();
        System.out.println(" e possui " + qtdMotores + " motores");
        System.out.println("-----------------------------------------------");
    }
}
