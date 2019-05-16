package exercises.question3.model;

import java.util.List;

public class Bill {
    private User user;
    private List<Product> products;

    public User getUser() {
        return user;
    }
    public void setUser(final User user) {
        this.user = user;
    }
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(final List<Product> products) {
        this.products = products;
    }
}
