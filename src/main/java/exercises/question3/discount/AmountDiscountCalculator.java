package exercises.question3.discount;

import java.util.List;

import exercises.question3.model.Product;
import exercises.question3.model.User;

public class AmountDiscountCalculator extends BillCalculator {
    private final int DISCOUNT_PER_100USD = 5;

    @Override
    public double calculateDiscount(final User user, final List<Product> products) {
        if(products != null && !products.isEmpty()) {
            final double total = calculateTotalAmount(products);
            return (int) total / 100 * DISCOUNT_PER_100USD;
        }

        return 0;
    }
}
