package exercises.question3;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import exercises.question3.discount.AmountDiscountCalculator;
import exercises.question3.discount.PercentageDiscountCalculator;
import exercises.question3.model.Bill;
import exercises.question3.model.Product;
import exercises.question3.model.User;

public class RetailWebsiteTest {
    private Bill bill;
    private RetailWebsite website;
    private PercentageDiscountCalculator percentageDiscount;
    private AmountDiscountCalculator amountDiscountCalculator;


    @Before
    public void prepareProductList() {
        final Product product1 = new Product("Product1", 70, false);
        final Product product2 = new Product("Product2", 50, false);
        final Product product3 = new Product("Product3", 40, true);

        final List<Product> products = Arrays.asList(product1, product2, product3);

        bill = new Bill();
        bill.setProducts(products);

        website = new RetailWebsite();
        website.setBill(bill);

        percentageDiscount = new PercentageDiscountCalculator();
        amountDiscountCalculator = new AmountDiscountCalculator();
    }

    @Test
    public void testApplyPercentageDiscountForEmployeeUser() {
        final User user = new User("Employee", true, false, 1);
        bill.setUser(user);

        website.setCalculator(percentageDiscount);

        final double netAmount = website.calculateNetAmount();
        assertEquals(124, netAmount, 0.001);
    }

    @Test
    public void testApplyPercentageDiscountForAffiliateUser() {
        final User user = new User("Affiliate", false, true, 1);
        bill.setUser(user);
        website.setCalculator(percentageDiscount);

        final double netAmount = website.calculateNetAmount();
        assertEquals(148, netAmount, 0.001);
    }

    @Test
    public void testApplyPercentageDiscountForNoneLoyaltyCustomer() {
        final User user = new User("None loyalty customer", false, false, 1);
        bill.setUser(user);

        website.setCalculator(percentageDiscount);

        final double netAmount = website.calculateNetAmount();
        assertEquals(160, netAmount, 0.001);
    }

    @Test
    public void testApplyPercentageDiscountFor3YearsLoyaltyCustomer() {
        final User user = new User("Loyalty customer", false, false, 3);
        bill.setUser(user);

        website.setCalculator(percentageDiscount);
        final double netAmount = website.calculateNetAmount();
        assertEquals(154, netAmount, 0.001);
    }

    @Test
    public void testApplyAmountBaseDiscount() {
        final User user = new User("Loyalty customer", false, false, 3);
        bill.setUser(user);

        website.setCalculator(amountDiscountCalculator);
        final double netAmount = website.calculateNetAmount();
        assertEquals(155, netAmount, 0.001);
    }
}
