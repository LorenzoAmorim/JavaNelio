package EXCEÇÕES_PERSONALIZADAS.model.exceptions;

// mudamos de 'Exception' para 'RuntimeException', pois com a segunda declaração, não é necessário o
// tratamento de exceções na classe 'Reservation(linha 16 e linha 49).
public class DomainException extends RuntimeException{

    // construtor que recebe uma string 'msg' como argumento, repassando a 'msg' para o construtor da superclasse
    // permite instanciar a exceção personalizada passando uma mensagem para ela.
    public DomainException (String msg){
        super(msg);
    }
}
