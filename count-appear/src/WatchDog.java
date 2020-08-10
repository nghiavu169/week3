import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
public class WatchDog {
    public void countWords(String input) {
        Map <String, String> map = new TreeMap<>();
        if (input != null) {
            String[] strings = input.split(" ");
            for (String word: strings) {
                if (map.containsKey(word)) {
                    int count = Integer.parseInt(map.get(word));
                    map.put(word, String.valueOf(count + 1));
                } else {
                    map.put(word, "1");
                }
            }
        }
        System.out.println("Count: " + map);
    }
    public static void main(String[] args) {
        WatchDog countWordTest = new WatchDog();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        countWordTest.countWords(input);
    }
}