public class MergeSort {
    void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        if (n1 >= 0) {
            System.arraycopy(arr, l, L, 0, n1);
            for (int i = 0; i < n2; ++i)
                R[i] = arr[m + 1 + i];
        } else {
            for (int i = 0; i < n2; ++i)
                R[i] = arr[m + 1 + i];
        }

        int i = 0, j = 0;

        int count = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[count] = L[i];
                i++;
            } else {
                arr[count] = R[j];
                j++;
            }
            count++;
        }

        while (i < n1) {
            arr[count] = L[i];
            i++;
            count++;
        }

        while (j < n2) {
            arr[count] = R[j];
            j++;
            count++;
        }
    }
    void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }
    static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + "\t");
    }

    public static void main(String[] args) {
        int[] arr = {1,3,0,2};

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}