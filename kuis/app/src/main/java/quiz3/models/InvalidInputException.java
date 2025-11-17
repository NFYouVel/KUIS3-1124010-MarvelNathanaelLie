package quiz3.models;

import java.util.InputMismatchException;

public class InvalidInputException extends Exception{

    public InvalidInputException(String message){
        super("From InvalidInputException: " + message);
    }
}
