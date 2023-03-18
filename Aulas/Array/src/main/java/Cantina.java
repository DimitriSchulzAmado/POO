public class Cantina {

    Salgado [] salgados = new Salgado[3];
    String nome;

    public void mostraInfo(){
        for (int i = 0; i < salgados.length; i++) {
            if (salgados[i] != null)
                System.out.println("O salgado: " + salgados[i].nome);
        }
    }
    public void addSalgado(Salgado novoSalgado){
        for (int i = 0; i < salgados.length; i++){
            if (salgados[i] == null){
                salgados[i] = novoSalgado;
                break;
            }
        }
    }
}
