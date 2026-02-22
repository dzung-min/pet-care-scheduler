import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String id;
    private String name;
    private String breed;
    private int age;
    private String ownerName;
    private String contactInfo;
    private LocalDate registrationDate;
    private List<Appointment> appointments;

    public Pet(String id, String breed, String name, int age, String ownerName, String contactInfo) {
        this.id = id;
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.ownerName = ownerName;
        this.contactInfo = contactInfo;
        this.registrationDate = LocalDate.now();
        this.appointments = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }
}
