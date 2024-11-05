import java.util.Date;

class Review implements ID {
    private int id;
    private int productId;
    private String username;
    private double rating;
    private String comment;
    private Date dateOfWriting;

    public Review(int id, int productId, String username, double rating, String comment, Date dateOfWriting) {
        this.id = id;
        this.productId = productId;
        this.username = username;
        this.rating = rating;
        this.comment = comment;
        this.dateOfWriting = dateOfWriting;
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
