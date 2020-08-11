import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        ProductManager products = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1.add");
            System.out.println("2.remove");
            System.out.println("3.update");
            System.out.println("4.search");
            System.out.println("5.list");
            int choices = Integer.parseInt(scanner.nextLine());
            switch (choices) {
                case 1 -> {
                    System.out.println("input id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("input name: ");
                    String name = scanner.nextLine();
                    System.out.println("input price: ");
                    float price = scanner.nextFloat();
                    scanner.nextLine();
                    products.add(new Product(id, name, price));
                }
                case 2 -> {
                    System.out.println("enter id to remove: ");
                    int id1 = Integer.parseInt(scanner.nextLine());
                    products.delete(id1);
                }
                case 3 -> {
                    System.out.println("enter id to update: ");
                    int id2 = Integer.parseInt(scanner.nextLine());
                    products.update(id2);
                }
                case 4 -> {
                    System.out.println("enter id to search: ");
                    String name1 = scanner.nextLine();
                    products.search(name1);
                }
                case 5 -> products.getAll();
                default -> System.exit(0);
            }
        }
        while (true);
    }
}