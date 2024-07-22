package Exceptions;

public class SectionCreator {
    public static void CreateSection(ErrorType e) {
        try {
            if(e == ErrorType.SECTION) {
                Section section = new Section(null, 1, "Instructor", "A1703");
            } else if(e ==  ErrorType.CAPACITY) {
                Section section = new Section("S15", 0, "Instructor", "A1703");
            } else if(e ==  ErrorType.INSTRUCTOR) {
                Section section = new Section("S15", 1, null, "A1703");
            } else if(e ==  ErrorType.ROOM) {
                Section section = new Section("S15", 1, "Instructor", null);
            } else {
                Section section = new Section("S15", 1, "Instructor", "A1703");
            }
            
        } catch (Exception err) {
            throw new SectionCreationFailedException(err);
        }
    }
}
