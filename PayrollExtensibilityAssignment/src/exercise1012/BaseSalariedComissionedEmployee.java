package exercise1012;

class BaseSalariedCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BaseSalariedCommissionEmployee(String name, Birthdate birthdate, double commissionRate, double sales, double baseSalary) {
        super(name, birthdate, commissionRate, sales);
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        double baseSalaryWithBonus = baseSalary * 1.1;
        double commissionPay = super.calculatePay();
        return baseSalaryWithBonus + commissionPay;
    }
}

