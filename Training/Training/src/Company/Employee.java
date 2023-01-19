package Company;

public class Employee extends Manager {
    
	@Override
	public void pay() {
		System.out.println("Employee Payable amount: ");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.salary = 10000;
		System.out.println("Salary of employee: "+e.salary);
		
		Manager m = new Manager();
		m.salary = 20000;
		System.out.println("Salary of manager: "+m.salary);

	}

}
