package exercises.question3.model;

public class Product {
    private String name;
    private double price;
    private boolean groceries;

    public Product() { }

    public Product(final String name, final double price, final boolean groceries) {
        this.name = name;
        this.price = price;
        this.groceries = groceries;
    }

    //Getter - Setter
    public double getPrice() {
        return price;
    }
    public void setPrice(final double price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }

    public boolean isGroceries() {
        return groceries;
    }

    public void setGroceries(final boolean groceries) {
        this.groceries = groceries;
    }
}
