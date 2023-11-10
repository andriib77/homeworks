package de.ait.homework47;

public class WrongArgumentsException extends RuntimeException{
    public WrongArgumentsException(String message) {
        super(message);
    }

    public WrongArgumentsException(String message, Throwable cause) {
        super(message, cause);
    }
}
