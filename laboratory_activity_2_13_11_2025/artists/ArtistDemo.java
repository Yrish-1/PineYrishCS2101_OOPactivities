package laboratory_activity_2_13_11_2025.artists;

public class ArtistDemo {
    public static void main(String[] args) {
        // Instance of Artist class
        Artist artist = new Artist("Charlie Puth", 32, "Music");
        artist.displayInfo();
        System.out.println();

        // Instance of Singer class
        Singer singer = new Singer("Nayeon Im", 29, "Music", Singer.Genre.POP);
        singer.displayInfo();
        System.out.println();

        // Additional examples
        Painter painter = new Painter("Vincent van Gogh", 37, "Visual Arts", Painter.Medium.OIL);
        painter.displayInfo();
        System.out.println();

        Writer writer = new Writer("Jane Austen", 41, "Literature", Writer.WritingStyle.FICTION);
        writer.displayInfo();
        System.out.println();

        Dancer dancer = new Dancer("Misty Copeland", 34, "Dance", Dancer.DanceStyle.BALLET);
        dancer.displayInfo();
    }
}
