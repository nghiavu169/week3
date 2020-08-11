import java.util.*;

public class ProductManager {
    List<Product> products = new ArrayList<>();

    public void add(Object object) {
        Product product = (Product) object;
        products.add(product);
        Collections.sort(products);
    }

    public void update(int id) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter new name: ");
        String name = scanner.nextLine();
        System.out.println("enter new price: ");
        float price = scanner.nextFloat();
        for (Product product : products) {
            if (id == product.getId()) {
                product.setNameProduct(name);
                product.setPrice(price);
            }
        }
    }

    public void delete(int id) {
        Product product = new Product();
        for (Product product1 : products) {
            if (id == product1.getId()) {
                product = product1;
            }
        }
        products.remove(product);
    }

    public void search(String name) {
        for (Product product : products) {
            if (name.equals(product.getNameProduct())) {
                System.out.println(product);
            }
        }
    }

    public void getAll() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}