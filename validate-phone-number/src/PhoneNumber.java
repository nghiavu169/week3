import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static Pattern pattern;
    private static final String PHONE_NUMBER = "[\\d]{2}[-][0][\\d]{9}";

    public PhoneNumber() {
        pattern = Pattern.compile(PHONE_NUMBER);
    }

    public boolean validate(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
