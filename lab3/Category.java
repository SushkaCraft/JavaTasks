import java.util.ArrayList;
import java.util.List;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
