public class ShapeFactory {
    Shape getShape(String shape) {
        return switch (shape) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            case "rectangle" -> new Rectangle();
            default -> null;
        };
    }
}
