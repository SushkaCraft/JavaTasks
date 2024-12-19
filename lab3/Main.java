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

        while (true) {
            try {
                System.out.println("Выберите режим: 1 - Администратор, 2 - Покупатель, 3 - Управление товарами и категориями, 0 - Выход");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    addProduct(admin, laptop, electronics);
                } else if (choice == 2) {
                    addProduct(admin, laptop, electronics);
                    customer.addToFavorites(laptop);
                    customer.addToCart(laptop);
                    customer.searchProduct(products, "laptop").forEach(product -> System.out.println("Найден продукт: " + product.getName()));
                    customer.placeOrder("Main Store", "Delivery", 2000);
                } else if (choice == 3) {
                    manageProductsAndCategories(scanner);
                } else if (choice == 0) {
                    System.out.println("Выход из программы...");
                    break;
                } else {
                    System.out.println("Неверный выбор. Пожалуйста, выберите 1, 2, 3 или 0 для выхода.");
                }
            } catch (Exception e) {
                System.out.println("Ошибка ввода! Пожалуйста, введите целое число.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    private static void manageProductsAndCategories(Scanner scanner) {
        System.out.println("Выберите действие:");
        System.out.println("1 - Добавить товар");
        System.out.println("2 - Добавить категорию");
        System.out.print("Введите номер: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addProductMenu(scanner);
                break;
            case 2:
                addCategoryMenu(scanner);
                break;
            default:
                System.out.println("Неверный выбор.");
        }
    }

    private static void addProductMenu(Scanner scanner) {
        System.out.println("Введите имя товара: ");
        String name = scanner.next();
        System.out.println("Введите описание товара: ");
        String description = scanner.next();
        System.out.println("Введите цену товара: ");
        double price = scanner.nextDouble();
        System.out.println("Введите количество на складе: ");
        int quantity = scanner.nextInt();
        System.out.println("Введите рейтинг товара: ");
        double rating = scanner.nextDouble();

        Category category = categories.get(0);
        Product product = new Product(products.size() + 1, name, description, price, true, category, "Brand", quantity, rating, "2023-12-19", 1);
        products.add(product);
        System.out.println("Товар добавлен: " + product.getName());
    }

    private static void addCategoryMenu(Scanner scanner) {
        System.out.println("Введите имя категории: ");
        String name = scanner.next();
        System.out.println("Введите описание категории: ");
        String description = scanner.next();

        Category category = new Category(categories.size() + 1, name, description);
        categories.add(category);
        System.out.println("Категория добавлена: " + category.getName());
    }

    private static void addProduct(Admin admin, Product laptop, Category electronics) {
        admin.addProduct(products, laptop);
        admin.editProduct(laptop, "Gaming Laptop", "Updated description", 1600, true, electronics, "Asus", 15, 4.9, "2023-09-10", 3);
        admin.deleteProduct(products, laptop);
    }
}
