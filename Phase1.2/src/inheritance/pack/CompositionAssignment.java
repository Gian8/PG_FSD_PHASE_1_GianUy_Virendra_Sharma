package inheritance.pack;

import java.util.ArrayList;
import java.util.List;

class Employee {
	public String name;
	public int age;
	public double salary;
	
	Employee(String name, int age, double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}	
}
class HR {
	private final List<Employee> es;
	HR(List<Employee> employees) {
		this.es = employees;
	}
	public List<Employee> totalEmployees(){
		return es;
	}
}

public class CompositionAssignment {
	public static void main(String args[]) {
		Employee e1 = new Employee("Matt", 26, 90000);
		Employee e2 = new Employee("Maria", 18,  45000);
		Employee e3 = new Employee("Jenny", 21, 66000);
		Employee e4 = new Employee("Sam", 21, 68500);
		
		List<Employee> em = new ArrayList<Employee>();
		em.add(e1);
		em.add(e2);
		em.add(e3);
		em.add(e4);
		
		HR employee = new HR(em);
		
		List<Employee> g = employee.totalEmployees();
		for (Employee e : g) {
			System.out.println("Name: " + e.name + ", Age: " + e.age + ", Salary: " + e.salary);
		}
	}
}
