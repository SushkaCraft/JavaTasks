class ShoppingCart implements ID {
    private int id;
    private List<Product> productList = new ArrayList<>();
    private double sumOfOrder;

    public ShoppingCart(int id) {
        this.id = id;
    }

    public void addProduct(Product product) {
        productList.add(product);
        sumOfOrder += product.getPrice();
    }

    public void removeProduct(Product product) {
        if (productList.remove(product)) {
            sumOfOrder -= product.getPrice();
        }
    }

    public void clear() {
        productList.clear();
        sumOfOrder = 0;
    }

    public double getSumOfOrder() {
        return sumOfOrder;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
