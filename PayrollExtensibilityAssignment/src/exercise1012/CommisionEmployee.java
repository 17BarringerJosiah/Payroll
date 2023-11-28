package exercise1012;

class CommissionEmployee extends Employee {
    private double commissionRate;
    private double sales;

    public CommissionEmployee(String name, Birthdate birthdate, double commissionRate, double sales) {
        super(name, birthdate);
        this.commissionRate = commissionRate;
        this.sales = sales;
    }

    public double calculatePay() {
        return commissionRate * sales;
    }
}

