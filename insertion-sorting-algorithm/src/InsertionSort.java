import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your size of list: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + size + "value");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Your list: ");
        System.out.println(Arrays.toString(list));
        System.out.println("\nBegin sort processing...");
        insertionSort(list, list.length);
    }

    public static void insertionSort(int[] list, int size) {
        int a, b;
        for (int i = 0; i < size; i++) {
            b = i - 1;
            a = list[i];
            while (b >= 0 && a < list[b]) {
                list[b + 1] = list[b];
                b--;
            }
            list[b + 1] = a;
        }
        System.out.println(Arrays.toString(list));
    }
}