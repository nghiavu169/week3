import java.util.Scanner;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeFactory shape = new ShapeFactory();
        do {
            try {
                String type = scanner.nextLine();
                shape.getShape(type).draw();
                break;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        while (true);
    }
}
