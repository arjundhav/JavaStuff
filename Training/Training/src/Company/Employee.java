package Company;

public class Employee extends Manager {
        
	public void pay() {
		System.out.println("Employee Pay amount: ");
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
