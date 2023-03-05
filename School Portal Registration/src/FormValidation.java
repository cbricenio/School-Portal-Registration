import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormValidation {
    public static boolean NameInput(String name) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]{1,50}$");
        Matcher matcher = pattern.matcher(name);
        boolean matchFound = matcher.find();
        return matchFound;
    }
    public static boolean DateInput(String birthDate) {
        Pattern pattern = Pattern.compile( "^((2000|2400|2800|(19|2[0-9])(0[48]|[2468][048]|[13579][26]))/02/29)$"
             + "|^(((19|2[0-9])[0-9]{2})/02/(0[1-9]|1[0-9]|2[0-8]))$"
             + "|^(((19|2[0-9])[0-9]{2})/(0[13578]|10|12)/(0[1-9]|[12][0-9]|3[01]))$"
             + "|^(((19|2[0-9])[0-9]{2})/(0[469]|11)/(0[1-9]|[12][0-9]|30))$");

        Matcher matcher = pattern.matcher(birthDate);
        boolean matchFound = matcher.find();
        return matchFound;
    }

    public static boolean CourseInput(String course) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(course);
        boolean matchFound = matcher.find();
        return matchFound;
    }

    public static boolean EmailInput(String email) {
        Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        Matcher matcher = pattern.matcher(email);
        boolean matchFound = matcher.find();
        return matchFound;
    }
}
