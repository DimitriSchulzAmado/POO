package controllers.errors;

// Tratando exceção checked
public class NotFoundSocialMediaException extends Exception{
    public NotFoundSocialMediaException(String message) {
        super(message);
        System.out.println("Rede social não achada");
    }
}

