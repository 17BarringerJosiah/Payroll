package exercise1012;

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String name, Birthdate birthdate, double weeklySalary) {
        super(name, birthdate);
        this.weeklySalary = weeklySalary;
    }

    public double calculatePay() {
        return weeklySalary;
    }
}

