import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

class Customer extends User {
    private List<Product> favorites = new ArrayList<>();
    private ShoppingCart shoppingCart = new ShoppingCart(getId());

    public Customer(int id, String name, String surname, String address, String phoneNumber, String email) {
        super(id, name, surname, address, phoneNumber, email);
    }

    public List<Product> searchProduct(List<Product> products, String query) {
        return products.stream()
                .filter(product -> product.getName().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Product> filterByCategory(List<Product> products, Category category) {
        return products.stream()
                .filter(product -> product.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    public List<Product> sortProducts(List<Product> products, Comparator<Product> comparator) {
        return products.stream().sorted(comparator).collect(Collectors.toList());
    }

    public void addToFavorites(Product product) {
        favorites.add(product);
        System.out.println("Товар добавлен в избранное: " + product.getName());
    }

    public void removeFromFavorites(Product product) {
        favorites.remove(product);
        System.out.println("Товар удален из избранного: " + product.getName());
    }

    public void addToCart(Product product) {
        shoppingCart.addProduct(product);
        System.out.println("Товар добавлен в корзину: " + product.getName());
    }

    public void removeFromCart(Product product) {
        shoppingCart.removeProduct(product);
        System.out.println("Товар удален из корзины: " + product.getName());
    }

    public void clearCart() {
        shoppingCart.clear();
        System.out.println("Корзина очищена.");
    }

    public Order placeOrder(String pickupPoint, String deliveryMethod, double paymentAmount) {
        double total = shoppingCart.getSumOfOrder();
        if (paymentAmount >= total) {
            Order order = new Order(getId(), shoppingCart.getProductList(), total, pickupPoint, deliveryMethod);
            System.out.println("Заказ успешно оформлен!");
            return order;
        } else {
            System.out.println("Недостаточно средств для оплаты.");
            return null;
        }
    }
}
