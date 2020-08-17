import java.util.Scanner;

class BinarySearch {
    int binarySearch(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) return mid;

            if (arr[mid] > x) return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }


    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else System.out.println("Element found at index " + result);
    }
}