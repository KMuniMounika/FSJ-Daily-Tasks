package jpademoo;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Table;
import jakarta.persistence.*;    //If use "*" no need of import individual annotations- Entity, Table, etc..

@Entity	//annotation
@Table(name="employees")	//annotation( Table name)- Which gives name as it is without changing any cases in table names. Ex-TodoList=TodoList instead of todo_list.
public class Employee {
	
	@Id		//You Generate ID automatically.Telling to JPA.
	@GeneratedValue(strategy=GenerationType.IDENTITY)	//Identity Property- Primary keys will be automatically incremented for id/ Choose Auto, SEQUENCE 
	private int id;
	private String name;
	private String department;
	private double salary;
	
	
	public Employee() {
		
	}

	public Employee(String name, String department, double salary) {
		super();
		
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
