package school.vo;

public class Teacher extends Person {
	private int salary;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, String id, String phone, int salary) {
		super(name, id, phone);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " ±Þ¿©: " + salary;
	}
	

}