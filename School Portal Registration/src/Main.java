import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RegistryForm form = new RegistryForm();

        System.out.println("SCHOOL PORTAL REGISTRATION\n");

        // Input Firstname
        do {
            System.out.print("Firstname: ");
            String firstName = scan.next();
            if(FormValidation.NameInput(firstName) == true){
                form.setFirstName(firstName);
                break;
            } else {
                System.out.println("Invalid Input.\n");
            }
        } while (true);

        // Input Lastname
        do {
            System.out.print("Lastname: ");
            String lastName = scan.next();
            if(FormValidation.NameInput(lastName) == true){
                form.setLastName(lastName);
                break;
            } else {
                System.out.println("Invalid Input.\n");
            }
        } while (true);

        // Input Birthday
        do {
            System.out.print("Birthdate (yyyy/MM/dd): ");
            String strBirthDate = scan.next();
            try{
                LocalDate birthDate = LocalDate.parse(strBirthDate, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
                if(FormValidation.DateInput(strBirthDate) == true){
                    LocalDate today = LocalDate.now();
                    int age = today.getYear() - birthDate.getYear();

                    if (today.getMonthValue() < birthDate.getMonthValue() || (today.getMonthValue() == birthDate.getMonthValue() && today.getDayOfMonth() < birthDate.getDayOfMonth())) {
                        age--;
                    }
                    if (age >= 17 ) {
                        form.setBirthDate(birthDate);
                        break;
                    } else {
                        System.out.println("Invalid: Age must be 17 years old and above.\n");
                    }
                } else {
                    System.out.println("Invalid Date.\n");
                }
            } catch (Exception e){
                System.out.println("Invalid Date Format.\n");
            }

        } while (true);

        // Input Course
        do {
            System.out.print("Course: ");
            String course = scan.next();
            if(FormValidation.CourseInput(course) == false){
                form.setCourse(course);
                break;
            } else {
                System.out.println("Invalid Input. (Course should not contain numerals).\n");
            }
        } while (true);

        // Input Email
        do {
            System.out.print("Email: ");
            String email = scan.next();
            if(FormValidation.EmailInput(email) == true){
                form.setEmail(email);
                break;
            } else {
                System.out.println("Invalid Email\n");
            }
        } while (true);
        System.out.println();
        System.out.println("Successfully Registered.");
        System.out.println("Student Number: " + form.getStudentNumber());

    }
}