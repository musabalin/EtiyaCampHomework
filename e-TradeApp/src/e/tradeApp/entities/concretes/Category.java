package e.tradeApp.entities.concretes;

import e.tradeApp.entities.abstracts.Entity;

public class Category extends Entity {


    private String categoryName;

    public Category(int id, String categoryName) {
        super(id);
        this.categoryName = categoryName;
    }

    public Category() {
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
