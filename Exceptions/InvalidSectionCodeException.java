public class InvalidSectionCodeException extends RuntimeException {
    public InvalidSectionCodeException(String sectionCode) {
        super("The given section code does not match the expected format. Received: " + sectionCode); 
    }
}
