import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static Pattern pattern;

    private static final String CLASSNAME = "^[CAP][\\d]{4}[GHIKLM]$";

    public ClassName() {
        pattern = Pattern.compile(CLASSNAME);
    }

    public boolean validate(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
