public class ClassNameTest {
    public static final String[] Class_Name = new String[] {"C4556G","c5494G"};

    public static void main(String[] args) {
        ClassName className = new ClassName();
        for (String name : Class_Name) {
            boolean valid = className.validate(name);
            System.out.println(name + " is " + valid);
        }
    }
}
