import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RegistryForm {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String course;
    private String email;

    public RegistryForm(){

    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentNumber() {
        String year = String.valueOf(LocalDate.now().getYear());
        String day = birthDate.format(DateTimeFormatter.ofPattern("dd"));
        String surnameInitial = lastName.substring(0, 1).toLowerCase();
        String studentNumber = year +"-"+ day +"01-"+ surnameInitial;
        return studentNumber;
    }
}
