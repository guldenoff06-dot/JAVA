import java.util.Arrays;
import java.util.List;

public class OrdersExample {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("Laptop", 1200),
                new Order("Phone", 800),
                new Order("Book", 50),
                new Order("Pen", 10)
        );

        // 1. Бағасы 100-ден жоғары
        List<Order> expensive = orders.stream()
                .filter(o -> o.getPrice() > 100)
                .toList();

        System.out.println("Қымбат тапсырыстар:");
        System.out.println(expensive);

        // 2. Жалпы сумма
        double total = orders.stream()
                .mapToDouble(Order::getPrice)
                .sum();

        System.out.println("Жалпы сумма: " + total);
    }
}


class order {
    String item;
    double price;

    void Order(String item, double price) {
        this.item = item;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return STR."\{item}: \{price}";
    }
}