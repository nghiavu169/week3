import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        float x = scanner.nextFloat();
        System.out.println("Hãy nhập y: ");
        float y = scanner.nextFloat();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }

    private void calculate(float x, float y) {
        try {
            float a = x + y;
            float b = x - y;
            float c = x * y;
            float d = x / y;
            System.out.println("Tổng: x + y = " + a);
            System.out.println("Hiệu: x - y = " + b);
            System.out.println("Tích: x * y = " + c);
            System.out.println("Thương: x / y = " + d);
        } catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}