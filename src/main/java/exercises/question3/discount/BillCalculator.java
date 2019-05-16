package exercises.question3.discount;

import java.util.List;

import exercises.question3.model.Product;
import exercises.question3.model.User;

public abstract class BillCalculator {

    public double calculateTotalAmount(final List<Product> products) {
        if(products != null && !products.isEmpty()) {
            return products.stream().mapToDouble(Product::getPrice).sum();
        }

        return 0;
    }

    public double calculateNetAmount(final User user, final List<Product> products) {
        final double total = calculateTotalAmount(products);
        final double discount = calculateDiscount(user, products);
        return total - discount;
    }

    public abstract double calculateDiscount(User user, List<Product> products);
}
