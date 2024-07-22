package Exceptions;

public class SectionCreationFailedException extends RuntimeException {
    public SectionCreationFailedException(Throwable cause) {
        super("Could not create section", cause);
    }
}
