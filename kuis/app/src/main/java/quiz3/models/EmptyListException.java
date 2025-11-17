package quiz3.models;

public class EmptyListException extends Exception{

    public EmptyListException(String message){
        super("From EmptyListException: " + message);
    }
}
