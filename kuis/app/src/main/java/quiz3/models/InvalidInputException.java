package quiz3.models;

import java.util.InputMismatchException;

public class InvalidInputException extends InputMismatchException{

    public InvalidInputException(String message){
        super("From InvalidInputException: " + message);
    }
}
