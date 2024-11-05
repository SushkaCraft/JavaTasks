class Category implements ID {
    private int id;
    private String name;
    private String description;
    private List<Category> linksToOtherCategories = new ArrayList<>();

    public Category(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public void addLinkedCategory(Category category) {
        linksToOtherCategories.add(category);
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
