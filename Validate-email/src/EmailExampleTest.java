public class EmailExampleTest {
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "0bc@hotmail1.cut" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean validated = emailExample.validate(email);
            System.out.println("Email: " + email +" is valid: "+ validated);
        }
        for (String email : invalidEmail) {
            boolean invalided = emailExample.validate(email);
            System.out.println("Email: " + email +" is valid: "+ invalided);
        }
    }
}