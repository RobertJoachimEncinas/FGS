package Exceptions;

public class InvalidInstructorException extends RuntimeException {
    public InvalidInstructorException() {
        super("Instructor name must not be null");
    }
}