import java.util.Arrays;
import java.util.List;

public class OrdersExample {
    public static void main(String[] args) {

        List<order> orders = Arrays.asList(
                new order("Laptop", 1200),
                new order("Phone", 800),
                new order("Book", 50),
                new order("Pen", 10)
        );

        // 1. Бағасы 100-ден жоғары
        List<order> expensive = orders.stream()
                .filter(o -> o.getPrice() > 100)
                .toList();

        System.out.println("Қымбат тапсырыстар:");
        System.out.println(expensive);

        // 2. Жалпы сумма
        double total = orders.stream()
                .mapToDouble(order::getPrice)
                .sum();

        System.out.println("Жалпы сумма: " + total);
    }
}


class order {
    String item;
    double price;

    order(String item, double price) {
        this.item = item;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return item + ": " + price;
    }
}
