import java.util.List;

class Admin extends User {

    public Admin(int id, String name, String surname, String address, String phoneNumber, String email) {
        super(id, name, surname, address, phoneNumber, email);
    }

    public void addProduct(List<Product> products, Product product) {
        products.add(product);
        System.out.println("Товар добавлен: " + product.getName());
    }

    public void editProduct(Product product, String name, String description, double price, boolean available, Category category, String brand, int discount, double rating, String arrivalDate, int warranty) {
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        product.setAvailable(available);
        product.setCategory(category);
        product.setBrand(brand);
        product.setDiscount(discount);
        product.setRating(rating);
        product.setArrivalDate(arrivalDate);
        product.setWarranty(warranty);
        System.out.println("Товар обновлен: " + product.getName());
    }

    public void deleteProduct(List<Product> products, Product product) {
        products.remove(product);
        System.out.println("Товар удален: " + product.getName());
    }

    public void addCategory(List<Category> categories, Category category) {
        categories.add(category);
        System.out.println("Категория добавлена: " + category.getName());
    }

    public void editCategory(Category category, String name, String description) {
        category.setName(name);
        category.setDescription(description);
        System.out.println("Категория обновлена: " + category.getName());
    }

    public void deleteCategory(List<Category> categories, Category category) {
        categories.remove(category);
        System.out.println("Категория удалена: " + category.getName());
    }
}
