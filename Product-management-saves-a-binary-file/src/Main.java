import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product_Manager products = new Product_Manager();
        ArrayList<Product> productList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1.add");
            System.out.println("2.remove");
            System.out.println("3.update");
            System.out.println("4.search");
            System.out.println("5.list");
            System.out.println("6.write");
            System.out.println("7.read");
            int choices = Integer.parseInt(scanner.nextLine());
            switch (choices) {
                case 1 -> {
                    System.out.println("input brand: ");
                    String brand = scanner.nextLine();
                    System.out.println("input id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("input name: ");
                    String name = scanner.nextLine();
                    System.out.println("input price: ");
                    float price = scanner.nextFloat();
                    scanner.nextLine();
                    products.add(new Product(brand, id, name, price),productList);
                }
                case 2 -> {
                    System.out.println("enter id to remove: ");
                    int id1 = Integer.parseInt(scanner.nextLine());
                    products.delete(id1, productList);
                }
                case 3 -> {
                    System.out.println("enter id to update: ");
                    int id2 = Integer.parseInt(scanner.nextLine());
                    products.update(id2,productList);
                }
                case 4 -> {
                    System.out.println("enter id to search: ");
                    int id3 = scanner.nextInt();
                    products.search(id3,productList);
                }
                case 5 -> products.getAll(productList);
                case 6 -> writeProductToFile(productList);
                case 7 -> readProductFromFile(productList);
                default -> System.exit(0);
            }
        }
        while (true);
    }
    public static void writeProductToFile(ArrayList<Product> products) {
        String fileName = "C:/Users/PC/OneDrive/Desktop/1.txt";
        File source = new File(fileName);

        try {
            FileOutputStream fos = new FileOutputStream(source,false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Product product : products) {
                oos.writeObject(product);
            }
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readProductFromFile(ArrayList<Product> products) {
        String fileName = "C:\\Users\\PC\\OneDrive\\Desktop\\1.txt";
        File source = new File(fileName);

        try {
            FileInputStream fis = new FileInputStream(source);
            ObjectInputStream ois = new ObjectInputStream(fis);
            int i = 0;
            while (i < products.size()) {
                Product product = (Product) ois.readObject();
                System.out.println(product);
                i++;
            }
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
