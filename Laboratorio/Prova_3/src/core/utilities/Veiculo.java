package core.utilities;

public class Veiculo implements Comparable<Veiculo>{
    private String marca; // Marca do veiculo
    private String modelo; // Modelo do veiculo
    private int ano; // Ano do veiculo
    private double kmRodados; // Qtd percorrida pelo veiculo
    Motor motor; // Instancia de motor

    public Veiculo() {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.kmRodados = kmRodados;
        // Composição
        motor = new Motor();
    }

    public void mostrarInfos(){
        System.out.println("++ Informações do Veiculo ++");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Rodado: " + this.kmRodados + "Km");
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getKmRodados() {
        return kmRodados;
    }

    public Motor getMotor() {
        return motor;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setKmRodados(double kmRodados) {
        this.kmRodados = kmRodados;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public int compareTo(Veiculo outroVeiculo) {
        return Integer.compare(this.ano, outroVeiculo.getAno());
    }
}
