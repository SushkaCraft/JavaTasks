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

    // Новый конструктор для Customer
    public Order(int id, List<Product> productList, double total, String pickupPoint, String deliveryMethod) {
        this.id = id;
        this.productListInOrder = productList;
        this.totalOrderAmount = total;
        this.shippingAddress = pickupPoint;
        this.payMethod = deliveryMethod;
        this.dateOfReg = new Date(); // Текущая дата
        this.orderStatus = "Новый"; // Начальный статус
    }

    // Полный конструктор
    public Order(int id, int orderNumber, Date dateOfReg, String orderStatus, List<Product> productListInOrder,
                 double totalOrderAmount, Date deliveryDate, String payMethod, String payStatus,
                 String shippingAddress, String contacts, String orderNotes) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.dateOfReg = dateOfReg;
        this.orderStatus = orderStatus;
        this.productListInOrder = productListInOrder;
        this.totalOrderAmount = totalOrderAmount;
        this.deliveryDate = deliveryDate;
        this.payMethod = payMethod;
        this.payStatus = payStatus;
        this.shippingAddress = shippingAddress;
        this.contacts = contacts;
        this.orderNotes = orderNotes;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getDateOfReg() {
        return dateOfReg;
    }

    public void setDateOfReg(Date dateOfReg) {
        this.dateOfReg = dateOfReg;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<Product> getProductListInOrder() {
        return productListInOrder;
    }

    public void setProductListInOrder(List<Product> productListInOrder) {
        this.productListInOrder = productListInOrder;
    }

    public double getTotalOrderAmount() {
        return totalOrderAmount;
    }

    public void setTotalOrderAmount(double totalOrderAmount) {
        this.totalOrderAmount = totalOrderAmount;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getOrderNotes() {
        return orderNotes;
    }

    public void setOrderNotes(String orderNotes) {
        this.orderNotes = orderNotes;
    }

    public void calculateTotalAmount() {
        totalOrderAmount = productListInOrder.stream().mapToDouble(Product::getPrice).sum();
    }

    public void displayOrderDetails() {
        System.out.println("Номер заказа: " + orderNumber);
        System.out.println("Дата регистрации: " + dateOfReg);
        System.out.println("Статус заказа: " + orderStatus);
        System.out.println("Список товаров в заказе:");
        productListInOrder.forEach(product -> System.out.println("- " + product.getName() + ": $" + product.getPrice()));
        System.out.println("Общая сумма заказа: $" + totalOrderAmount);
        System.out.println("Дата доставки: " + deliveryDate);
        System.out.println("Метод оплаты: " + payMethod);
        System.out.println("Статус оплаты: " + payStatus);
        System.out.println("Адрес доставки: " + shippingAddress);
        System.out.println("Контакты: " + contacts);
        System.out.println("Заметки к заказу: " + orderNotes);
    }
}
