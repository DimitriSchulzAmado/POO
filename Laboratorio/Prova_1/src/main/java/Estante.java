public class Estante {
    int idEstante;
    char letra;
    Livro[] livro = new Livro[120];

    // Mostrando todas as informações do livro
    public void mostrarInfos(){
        System.out.println("*** Localização ***");
        System.out.println("Número da Estante: " + this.idEstante);
        System.out.println("Letra: " + this.letra);
    }

    // Adicionando um novo livro à estante
    public void addLivro(Livro liv){
        for (int i = 0; i < livro.length; i++) {
            if (livro[i] == null){
                livro[i] = liv;
                break;
            }
        }
    }

    public void porcentagemGen(){
        int drama = 0;
        int suspense = 0;
        int outrosGen = 0;
        int all = 0;

        for (int i = 0; i < livro.length; i++) {
            if(livro[i].genLiterario.equalsIgnoreCase("Drama")){
                drama++;
            } else if (livro[i].genLiterario.equalsIgnoreCase("Suspense")) {
                suspense++;
            } else if (livro[i].genLiterario.equalsIgnoreCase("Outro")) {
                outrosGen++;
            }
            all += drama + suspense + outrosGen;
        }
        System.out.println("Drama: " + (drama / all)*100 + "%");
        System.out.println("Suspense: " + (suspense / all)*100 + "%");
        System.out.println("Outros: " + (outrosGen / all)*100 + "%");
    }

    public void livroMaisEMenosPag(){
        int maior = 0;
        int menor = 99999;
        for (int i = 0; i < livro.length; i++) {
            // Mais páginas
            if (livro[i].qtdFolhas > maior) {
                maior = livro[i].qtdFolhas;
            }
            // Menos páginas
            if (livro[i].qtdFolhas < menor){
                menor = livro[i].qtdFolhas;
            }
        }
        System.out.println("Livro com mais folhas: " + maior);
        System.out.println("Livro com menos folhas: " + menor);
    }
}
