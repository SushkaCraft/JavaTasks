import java.util.ArrayList;
import java.util.List;

class User implements ID {
    private int id;
    private String name;
    private String surname;
    private String address;
    private String phoneNumber;
    private String email;
    private List<Order> orderList = new ArrayList<>();
    private List<Order> buyingHistory = new ArrayList<>();
    private List<ShoppingCart> shoppingCartHistory = new ArrayList<>();

    public User(int id, String name, String surname, String address, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
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
