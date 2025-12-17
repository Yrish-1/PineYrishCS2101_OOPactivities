package laboratory_activity_2_13_11_2025.artists;

public class Dancer extends Artist {
    public enum DanceStyle {
        BALLET, HIPHOP, JAZZ, CONTEMPORARY
    }

    private DanceStyle danceStyle;

    public Dancer(String name, int age, String specialty, DanceStyle danceStyle) {
        super(name, age, specialty);
        this.danceStyle = danceStyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("Dancer's Info:");
        super.displayInfo();
        System.out.println("Dance Style: " + danceStyle);
    }

    public DanceStyle getDanceStyle() {
        return danceStyle;
    }
}
