package set;

import java.util.HashSet;
import java.util.Set;

public class EmployeesSet {

	public static void main(String[] args) {
		Set<Employee> eployees=new HashSet<>();
		eployees.add(new Employee(123,  "Shaun"));
		eployees.add(new Employee(777,  "Bob"));
		eployees.add(new Employee(789,  "Patel"));
		eployees.add(new Employee(789,  "Patel"));
		
		System.out.println(eployees);
		
	}

}
