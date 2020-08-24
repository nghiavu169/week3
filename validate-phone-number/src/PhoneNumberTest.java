public class PhoneNumberTest {
    public static final String[] Phone_Number = new String[] {"00-0123456789","231-516565155"};

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        for (String number : Phone_Number) {
            boolean valid = phoneNumber.validate(number);
            System.out.println(number + " is " + valid);
        }
    }
}
