package laboratory_activity_2_13_11_2025.artists;

public class Writer extends Artist {
    public enum WritingStyle {
        FICTION, NONFICTION, POETRY, DRAMA
    }

    private WritingStyle writingStyle;

    public Writer(String name, int age, String specialty, WritingStyle writingStyle) {
        super(name, age, specialty);
        this.writingStyle = writingStyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("Writer's Info:");
        super.displayInfo();
        System.out.println("Writing Style: " + writingStyle);
    }

    public WritingStyle getWritingStyle() {
        return writingStyle;
    }
}
