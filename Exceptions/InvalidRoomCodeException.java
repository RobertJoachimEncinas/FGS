package Exceptions;

public class InvalidRoomCodeException extends RuntimeException {
    public InvalidRoomCodeException(String roomCode) {
        super("The given room code does not match the expected format. Received: " + roomCode); 
    }
}
