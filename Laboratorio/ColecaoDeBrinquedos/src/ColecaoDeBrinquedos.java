public class ColecaoDeBrinquedos {
    Brinquedo [] brinquedos = new Brinquedo[100];
    public void adicionarBrinquedos(Brinquedo brinquedo){
        for (int i = 0; i < brinquedos.length; i++) {
            if (brinquedos[i] == null){
                brinquedos[i] = brinquedo;
                break;
            }
        }
    }

    public void listarBrinquedos(){
        for (int i = 0; i < brinquedos.length; i++) {
            if (brinquedos[i] != null) {
                if (brinquedos[i] instanceof Aviao) {
                    brinquedos[i].ligar();
                    brinquedos[i].mover();
                    brinquedos[i].mostraInfo();
                } else if (brinquedos[i] instanceof Barco) {
                    brinquedos[i].ligar();
                    brinquedos[i].mover();
                    brinquedos[i].mostraInfo();
                }
            }
        }
    }
}
