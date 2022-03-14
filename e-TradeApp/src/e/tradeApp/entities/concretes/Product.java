package e.tradeApp.entities.concretes;

import e.tradeApp.entities.abstracts.Entity;

public class Product extends Entity {
    private String name;
    private double unitPrice;


    private int categoryId;

    public Product() {
    }

    public Product(int id, String name, double unitPrice, int categoryId) {
        super(id);
        this.name = name;
        this.categoryId = categoryId;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }


}
