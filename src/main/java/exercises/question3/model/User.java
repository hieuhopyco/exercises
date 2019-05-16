package exercises.question3.model;

public class User {
    private String name;
    private boolean employee;
    private boolean affiliate;
    private int yearOfLoyalty;

    public User() { }

    public User(final String name, final boolean employee, final boolean affiliate, final int yearOfLoyalty) {
        super();
        this.name = name;
        this.employee = employee;
        this.affiliate = affiliate;
        this.yearOfLoyalty = yearOfLoyalty;
    }

    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public int getYearOfLoyalty() {
        return yearOfLoyalty;
    }
    public void setYearOfLoyalty(final int yearOfLoyalty) {
        this.yearOfLoyalty = yearOfLoyalty;
    }

    public boolean isEmployee() {
        return employee;
    }

    public void setEmployee(final boolean employee) {
        this.employee = employee;
    }

    public boolean isAffiliate() {
        return affiliate;
    }

    public void setAffiliate(final boolean affiliate) {
        this.affiliate = affiliate;
    }
}
