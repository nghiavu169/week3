import java.util.Arrays;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] myArray = {1, 2, 3, 4, 5};
        for (int i : myArray) {
            stack.push(i);
        }
        int[] reverseArray = new int[myArray.length];
        for(int i=0; i<myArray.length; i++) {
                reverseArray[i] = stack.pop();
        }
        System.out.println("Reversed array is: "+Arrays.toString(reverseArray));
    }
}