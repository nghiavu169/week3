import java.io.Serializable;

public class Product implements Serializable {
    int id;
    String name, brand;
    float price;

    public Product() {}

    public Product(String brand, int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
