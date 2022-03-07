public abstract class Employee {
	public abstract int getSalary();
	public abstract String getGrade();
	public abstract void setSalary(int s);
	public abstract void setGrade(String g);
	public abstract void label();
	
}

public class Engineer extends Employee{
	
private int salary;
private String grade;
		@Override
		public int getSalary() {
			// TODO Auto-generated method stub
			return this.salary;
		}

		@Override
		public String getGrade() {
			// TODO Auto-generated method stub
			return this.grade;
		}

		@Override
		public void setSalary(int s) {
			// TODO Auto-generated method stub
			this.salary=s;
		}

		@Override
		public void setGrade(String g) {
			// TODO Auto-generated method stub
			this.grade=g;
		}

		@Override
		public void label() {
			// TODO Auto-generated method stub
			System.out.println("Employee's data:");
			System.out.println("GRADE "+":" + this.grade);
			System.out.println("SALARY "+":" + this.salary);
		}
		
	}
public class Manager extends Employee{
	private int salary;
	private String grade;

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public String getGrade() {
		// TODO Auto-generated method stub
		return grade;
	}

	@Override
	public void setSalary(int s) {
		// TODO Auto-generated method stub
		this.salary=s;
	}

	@Override
	public void setGrade(String g) {
		// TODO Auto-generated method stub
		this.grade=g;
	}

	@Override
	public void label() {
		// TODO Auto-generated method stub
		System.out.println("Employee's data:");
		System.out.println("GRADE "+":" + this.grade);
		System.out.println("SALARY "+":" + this.salary);
	}

}

