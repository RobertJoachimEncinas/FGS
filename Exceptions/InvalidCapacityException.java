package Exceptions;

public class InvalidCapacityException extends RuntimeException {
    public InvalidCapacityException(int capacity) {
        super("Capacity cannot be less than 1. Received: " + capacity);
    }
}
