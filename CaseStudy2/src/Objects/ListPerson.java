package Objects;

import java.util.ArrayList;
import java.util.List;

public abstract class ListPerson {
    int id, sold_products, salary;
    List<Person> list = new ArrayList<>();
    SalesMan salesMan = new SalesMan(id, sold_products, salary);
}
