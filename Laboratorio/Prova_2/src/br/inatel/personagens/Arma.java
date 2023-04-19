package br.inatel.personagens;

public class Arma {
    // Atributos
    private int forca;
    private String tipoArma;

    public void mostrarInfos() {
        System.out.println("------ ARMA ------");
        System.out.println("Força " + this.forca);
        System.out.println("Tipo: " + this.tipoArma);
    }

    // Getter & Setter

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }
}
