package Company;

public class Ceo extends Manager {

	public static void main(String[] args) {
		
		Ceo c = new Ceo();
		c.salary = 10000;
		c.bonus = " Not Applicable";
		c.pay();
		System.out.println("Salary of employee: "+c.salary+"\nBonus: "+c.bonus+"\n ");
		
	}

}
