package exceptions;

public class SaldoInsuficienteException extends Exception{
    /*
    * Classe que vai enviar a mensagem quando der a exception(checked)
    * Exception -> Erro enquanto compila o código, antes de executar
    * */

    // Construtor por conta da herança(extends)
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
