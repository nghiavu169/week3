import javax.imageio.IIOException;
import java.io.*;
import java.util.*;

public class WriteATextFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input: ");
        String src = scanner.nextLine();
        try {
            FileWriter writer = new FileWriter(src);
            System.out.println("enter noi dung: ");
            String text = scanner.nextLine();
            writer.write(text);
            writer.close();
        }
        catch (IIOException e) {
            e.printStackTrace();
        }
    }
}