public class Main {
    private static List<Product> productList = new ArrayList<>();
    private static List<Order> orderList = new ArrayList<>();
    private static List<User> userList = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        initializeData();

        System.out.println("Welcome to the online store!");
        System.out.println("1. View Products");
        System.out.println("2. Exit");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                viewProducts();
                break;
            case 2:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    private static void initializeData() {
        productList.add(new Product(1, "Product A", "Description A", 100.0, true, "Category 1", "Brand A", 0.0, 5.0, "2024-10-01", "1 year"));
        productList.add(new Product(2, "Product B", "Description B", 200.0, true, "Category 2", "Brand B", 10.0, 4.0, "2024-09-01", "2 years"));
    }

    private static void viewProducts() {
        System.out.println("Products available:");
        for (Product product : productList) {
            System.out.println(product.name + " - " + product.price);
        }
    }
}
