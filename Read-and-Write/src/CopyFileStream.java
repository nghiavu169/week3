import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFileStream {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Source: ");
        String src = scanner.nextLine();
        System.out.println("Copy: ");
        String copied = scanner.nextLine();
        var source = new File(src);
        var copy = new File(copied);

        try (var fis = new FileInputStream(source); var fos = new FileOutputStream(copy)) {
            byte[] buffer = new byte[10000];

            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        }
    }
}