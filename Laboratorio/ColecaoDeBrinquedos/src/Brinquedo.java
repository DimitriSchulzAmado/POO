public class Brinquedo {
    private String modelo;
    private String cor;
    private static int qtdBrinquedos;

    public Brinquedo (String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        qtdBrinquedos++;
    }

    public void mover(){}

    public void ligar(){}

    public void mostraInfo(){
        System.out.print("é do modelo " + this.getModelo() + " e possui cor " + this.getCor());
    }

    // Getter & Setter
    public String getModelo() {
        return modelo;
    }


    public String getCor() {
        return cor;
    }

}
