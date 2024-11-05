import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Order implements ID {
    private int id;
    private int orderNumber;
    private Date dateOfReg;
    private String orderStatus;
    private List<Product> productListInOrder = new ArrayList<>();
    private double totalOrderAmount;
    private Date deliveryDate;
    private String payMethod;
    private String payStatus;
    private String shippingAddress;
    private String contacts;
    private String orderNotes;

    public Order(int id, int orderNumber, Date dateOfReg, String orderStatus) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.dateOfReg = dateOfReg;
        this.orderStatus = orderStatus;
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
