package Exceptions;

public class Section {
    private String sectionCode;
    private int capacity;
    private String instructor;
    private String roomCode;

    public Section(String sectionCode, int capacity, String instructor, String roomCode) {
        validateSectionCode(sectionCode);
        validateCapacity(capacity);
        validateInstructor(instructor);
        validateRoomCode(roomCode);

        this.sectionCode = sectionCode;
        this.capacity = capacity;
        this.instructor = instructor;
        this.roomCode = roomCode;
    }

    private void validateSectionCode(String sectionCode) {
        if(sectionCode == null) {
            throw new InvalidSectionCodeException(sectionCode);
        }

        boolean isValid = false;
        char[] validSectionPrefixes = { 'A', 'S', 'J', 'X', 'Y', 'Z' };

        for(char prefix: validSectionPrefixes) {
            if(prefix == sectionCode.charAt(0)) {
                isValid = true;
            }
        }

        try {
            int code = Integer.parseInt(sectionCode.substring(1));

            if(code < 10 || code > 19) {
                isValid = false;
            }
        } catch(NumberFormatException e) {
            isValid = false;
        }

        if(!isValid) {
            throw new InvalidSectionCodeException(sectionCode);
        }
    }

    private void validateCapacity(int capacity) {
        if(capacity < 1) {
            throw new InvalidCapacityException(capacity);
        }
    }

    private void validateInstructor(String instructor) {
        if(instructor == null) {
            throw new InvalidInstructorException();
        }
    }

    private void validateRoomCode(String roomCode) {
        if(roomCode == null) {
            throw new InvalidRoomCodeException(roomCode);
        }

        boolean isValid = false;
        char[] validRoomPrefixes = { 'A', 'Y', 'J', 'G', 'E', 'V', 'M', 'L' };

        for(char prefix: validRoomPrefixes) {
            if(prefix == roomCode.charAt(0)) {
                isValid = true;
            }
        }

        try {
            int code = Integer.parseInt(roomCode.substring(1));

            if(code < 101) {
                isValid = false;
            }
        } catch(NumberFormatException e) {
            isValid = false;
        }

        if(!isValid) {
            throw new InvalidRoomCodeException(roomCode);
        }
    }
}
