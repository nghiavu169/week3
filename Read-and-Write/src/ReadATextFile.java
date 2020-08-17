import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadATextFile {
    public static void main(String[] args) {
        ReadATextFile file = new ReadATextFile();
        System.out.println(file.copy());
    }
    public List<String> copy() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String src = scanner.nextLine();
        try {
            File inFile = new File(src);
            FileReader fileReader = new FileReader(inFile);

            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
