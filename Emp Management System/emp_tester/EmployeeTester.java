package emp_tester;

import com.app.org.Emp;
import com.app.org.Manager;
import com.app.org.Worker;

public class EmployeeTester {

	public static void main(String[] args) {
		// Hire 1 Manager and 1 Worker
		
		
		
		// UpCasting 
		Emp emp1 = new Manager("Maintenance", 25000.0, 5000.0);
		Emp emp2 = new Manager("Production", 15000.0, 3500);
		Emp emp3 = new Manager("Maintenance", 25000.0, 5000.0);
		Emp emp4 = new Worker("Maintenance", 25000.0, 500,150);
		
		Emp e1 = new Emp("Maintenance", 25000.0);
		Emp e2 = new Emp("Maintenance", 25000.0);
		Emp e3 = new Emp("Maintenance", 25000.0);
		Emp e4 = new Emp("Maintenance", 25000.0);
		
		
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		System.out.println(emp4.toString());
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		System.out.println(e4.toString());
	}

}
