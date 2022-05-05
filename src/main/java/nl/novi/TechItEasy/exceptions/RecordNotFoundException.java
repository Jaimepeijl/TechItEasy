package nl.novi.TechItEasy.exceptions;

//    De RecordNotFoundException bevat:
//    een default exception
//    een exception met message

public class RecordNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public RecordNotFoundException(){
        super();
    }
    public RecordNotFoundException(String message){
        super(message);
    }

}
