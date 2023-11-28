package exercise1012;

abstract class Employee {
    private String name;
    private Birthdate birthdate;
    
    public Employee(String name, Birthdate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }
    
    public Birthdate getBirthdate() {
    	return birthdate;
    }

    public abstract double calculatePay();

}