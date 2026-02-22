import java.time.LocalDateTime;

public class Appointment {
    private String appointmentType; // ie: visit, vaccination, grooming
    private LocalDateTime time;
    private String note; // optional

    public Appointment(String appointmentType) {
        this.appointmentType = appointmentType;
        this.time = LocalDateTime.now();
    }

    public Appointment(String appointmentType, String note) {
        this.appointmentType = appointmentType;
        this.note = note;
        this.time = LocalDateTime.now();
    }

    public String getAppointmentType() {
        return appointmentType;
    }

    public String getNote() {
        return note;
    }

    public LocalDateTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Appointment Type: " + appointmentType + "\n" +
                "Appointment Time: " + time + "\n" +
                "Note: " + note;
    }
}
