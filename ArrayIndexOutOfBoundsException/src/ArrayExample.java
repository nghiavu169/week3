import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap size: ");
        int size = scanner.nextInt();
        Integer[] arr = new Integer[size];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(99);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
            int x = Integer.parseInt(scanner.nextLine());
            try {
                System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
                break;
            } catch (IndexOutOfBoundsException e) {
                System.err.println("sai con đĩ mẹ rồi");
            }
        }
        while (true);
    }
}
