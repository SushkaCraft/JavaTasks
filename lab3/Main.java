import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Product> products = new ArrayList<>();
    private static List<Category> categories = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin(1, "Admin", "Smith", "Admin Address", "555-0000", "admin@example.com");
        Customer customer = new Customer(2, "John", "Doe", "123 Elm St", "555-1234", "john@example.com");

        Category electronics = new Category(1, "Electronics", "Electronic items");
        categories.add(electronics);
        Product laptop = new Product(1, "Laptop", "High-end gaming laptop", 1500, true, electronics, "Dell", 10, 4.8, "2023-09-01", 2);
        products.add(laptop);

        System.out.println("Выберите режим: 1 - Администратор, 2 - Покупатель");
        int choice = scanner.nextInt();

        if (choice == 1) {
            admin.addProduct(products, laptop);
            admin.editProduct(laptop, "Gaming Laptop", "Updated description", 1600, true, electronics, "Asus", 15, 4.9, "2023-09-10", 3);
            admin.deleteProduct(products, laptop);
        } else if (choice == 2) {
            customer.addToFavorites(laptop);
            customer.addToCart(laptop);
            customer.searchProduct(products, "laptop").forEach(product -> System.out.println("Найден продукт: " + product.getName()));
            customer.placeOrder("Main Store", "Delivery", 2000);
        } else {
            System.out.println("Неверный выбор.");
        }

        scanner.close();
    }
}
