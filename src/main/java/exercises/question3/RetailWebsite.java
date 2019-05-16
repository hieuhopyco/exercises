package exercises.question3;

import exercises.question3.discount.BillCalculator;
import exercises.question3.model.Bill;

public class RetailWebsite {
    private Bill bill;
    private BillCalculator calculator;


    public double calculateNetAmount() {
        return calculator.calculateNetAmount(bill.getUser(), bill.getProducts());
    }

    //Getter - Setter
    public Bill getBill() {
        return bill;
    }

    public void setBill(final Bill bill) {
        this.bill = bill;
    }

    public BillCalculator getCalculator() {
        return calculator;
    }

    public void setCalculator(final BillCalculator calculator) {
        this.calculator = calculator;
    }
}
