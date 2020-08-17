import java.util.*;

public class Product_Manager {

    void add(Product product, ArrayList<Product> products) {
        products.add(product);
    }

    void update(int id, ArrayList<Product> products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new price: ");
        float price = scanner.nextFloat();
        for (Product product : products){
            if (id == product.getId()) {
                product.setName(name);
                product.setPrice(price);
            }
        }
    }

    void delete(int id, ArrayList<Product> products) {
        Product product = new Product();
        for (Product product1 : products) {
            if (id == product1.getId()) {
                product = product1;
            }
        }
        products.remove(product);
    }

    void search(int id, ArrayList<Product> products) {
        for (Product product : products) {
            if (id == product.getId()) {
                System.out.println(product);
            }
        }
    }

    void getAll(ArrayList<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
