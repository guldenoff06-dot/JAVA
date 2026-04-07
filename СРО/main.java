import java.util.HashMap;
import java.util.Map;

class Product {
    int quantity;
    double price;

    Product(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return "Саны: " + quantity + ", Бағасы: " + price;
    }
}

public class main {
    public static void main(String[] args) {

        Map<String, Product> warehouse = new HashMap<>();

        // ➕ CREATE (қосу)
        warehouse.put("Алма", new Product(10, 500));
        warehouse.put("Банан", new Product(5, 700));

        // 📖 READ (қарау)
        System.out.println("Барлық тауарлар:");
        for (String name : warehouse.keySet()) {
            System.out.println(name + " -> " + warehouse.get(name));
        }

        // ✏️ UPDATE (жаңарту)
        warehouse.put("Алма", new Product(20, 550));

        // 🔍 SEARCH (іздеу)
        String search = "Алма";
        if (warehouse.containsKey(search)) {
            System.out.println("Табылды: " + warehouse.get(search));
        } else {
            System.out.println("Тауар табылмады");
        }

        // ❌ DELETE (жою)
        warehouse.remove("Банан");

        System.out.println("Жаңартылған тізім:");
        for (String name : warehouse.keySet()) {
            System.out.println(name + " -> " + warehouse.get(name));
        }
    }
}