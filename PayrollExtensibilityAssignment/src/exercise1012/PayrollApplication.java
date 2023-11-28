package exercise1012;

import java.util.Calendar;

public class PayrollApplication {
	
    public static void main(String[] args) {
    	
    	System.out.println("Josiah Barringer - PROGRAMMING: Payroll Extensibility Assignment");
    	
    	Birthdate frankJerksonBirthdate = new Birthdate(7, 15, 1990);
        Birthdate fredJohnnyWillBirthdate = new Birthdate(6, 20, 1995);
        Birthdate kirkCousinsBirthdate = new Birthdate(8, 19, 1988);
        Birthdate justinJeffersonBirthdate = new Birthdate(6, 16, 1999);
    	

        Employee[] employees = {
                new SalariedEmployee("Frank Jerkson", frankJerksonBirthdate, 1000),
                new HourlyEmployee("Fred Johnny-Will", fredJohnnyWillBirthdate, 20, 45),
                new CommissionEmployee("Kirk Cousins", kirkCousinsBirthdate, 0.5, 5000000),
                new BaseSalariedCommissionEmployee("Justin Jefferson", justinJeffersonBirthdate, 0.25, 2000000, 45000)
        };

        Calendar calendar = Calendar.getInstance();
        int currentMonth = calendar.get(Calendar.MONTH) + 1; 

        for (Employee employee : employees) {
            System.out.print(employee.getName() + ": ");
            double pay = employee.calculatePay();
            if (employee.getBirthdate().getMonth() == currentMonth) {
                pay += 100.00; 
            }
            System.out.println(pay);
        }
    }
}