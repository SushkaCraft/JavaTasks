import java.util.ArrayList;
import java.util.List;

class ShoppingCart implements ID {
    private int id;
    private List<Product> productList = new ArrayList<>();
    private int numOfProduct;
    private double sumOfOrder;
    private String couponCode;
    private String orderStatus;

    public ShoppingCart(int id) {
        this.id = id;
    }

    public void addProduct(Product product) {
        productList.add(product);
        numOfProduct++;
        sumOfOrder += product.getPrice();
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
