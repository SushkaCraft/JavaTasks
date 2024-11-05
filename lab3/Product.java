import java.util.ArrayList;
import java.util.List;

class Product implements ID {
    private int id;
    private String name;
    private String description;
    private double price;
    private boolean available;
    private Category category;
    private String brand;
    private double rating;
    private int discount;
    private String arrivalDate;
    private int warranty;

    public Product(int id, String name, String description, double price, boolean available, Category category, String brand, int discount, double rating, String arrivalDate, int warranty) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.available = available;
        this.category = category;
        this.brand = brand;
        this.discount = discount;
        this.rating = rating;
        this.arrivalDate = arrivalDate;
        this.warranty = warranty;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
