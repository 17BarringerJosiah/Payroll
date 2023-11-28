package exercise1012;

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, Birthdate birthdate, double hourlyRate, double hoursWorked) {
        super(name, birthdate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculatePay() {
        if (hoursWorked <= 40) {
            return hourlyRate * hoursWorked;
        } else {
            double regularPay = hourlyRate * 40;
            double overtimePay = (hoursWorked - 40) * (hourlyRate * 1.5);
            return regularPay + overtimePay;
        }
    }
}

