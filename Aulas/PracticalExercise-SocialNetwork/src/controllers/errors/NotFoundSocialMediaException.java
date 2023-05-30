package controllers.errors;

public class NotFoundSocialMediaException extends Exception{
    public NotFoundSocialMediaException(String message) {
        super(message);
        System.out.println("Rede social não achada");
    }
}

