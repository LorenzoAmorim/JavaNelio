package EXERCICIO_EXCEÇÕES_PERSONALIZADAS.model.exceptions;

public class BusinessException extends RuntimeException {

    public BusinessException(String msg){
        super(msg);
    }
}
