import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        while (number >= 2){
            stack.push((int) (number % 2));
            number = number / 2;
        }
        if (number < 2){
            stack.push(1);
        }

        Stack<Integer> newStack = new Stack<>();
        while (!stack.empty()) {
            for (int i = 0; i < stack.size(); i++) {
                newStack.push(stack.pop());
            }
        }
        System.out.println(newStack);
    }
}