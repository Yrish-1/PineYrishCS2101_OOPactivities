package laboratory_activity_2_13_11_2025.artists;

public class Artist {
    private String name;
    private int age;
    private String specialty;

    public Artist(String name, int age, String specialty) {
        this.name = name;
        this.age = age;
        this.specialty = specialty;
    }

    public void displayInfo() {
        System.out.println("Artist Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialty: " + specialty);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialty() {
        return specialty;
    }
}
