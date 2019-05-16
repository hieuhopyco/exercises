package exercises.question3.discount;

import java.util.List;

import exercises.question3.model.Product;
import exercises.question3.model.User;

public class PercentageDiscountCalculator extends BillCalculator {
    private final double EMPLOYEE_DISCOUNT = 0.3;
    private final double AFFILIATE_DISCOUNT = 0.1;
    private final double LOYALTY_CUSTOMER_FOR_2YEARS_DISCOUNT = 0.05;


    @Override
    public double calculateDiscount(final User user, final List<Product> products) {
        if(products != null && !products.isEmpty()) {
            final double percentDiscount = getPercentDiscountForUser(user);
            return products.stream().filter(o -> o.isGroceries() == false).mapToDouble(Product::getPrice).sum() * percentDiscount;
        }

        return 0;
    }


    private double getPercentDiscountForUser(final User user) {
        if(user.isEmployee()) {
            return EMPLOYEE_DISCOUNT;
        }

        if(user.isAffiliate()) {
            return AFFILIATE_DISCOUNT;
        }

        if(user.getYearOfLoyalty() > 2) {
            return LOYALTY_CUSTOMER_FOR_2YEARS_DISCOUNT;
        }

        return 0;
    }
}
