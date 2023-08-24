package Exceptions;

public class DomainException extends RuntimeException{

    public DomainException(String message) {
        super(message);
    }

    public DomainException(String message, Throwable cause) {
        super(message, cause);
    }


    public static DomainException parametrosInvalidos(){
        return new DomainException("O segundo parâmetro deve ser maior que o primeiro.");
    }
}
