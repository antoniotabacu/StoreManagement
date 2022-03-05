
public class Employee {
	
	private int employee_ID,salary,store_ID;
	private String surname, forename, cnp, location;
	
	public Employee(int employee_ID, String surname, String forename, String cnp, int salary, int store_ID, String location) {
		this.employee_ID=employee_ID;
		this.surname=surname;
		this.forename=forename;
		this.cnp=cnp;
		this.salary=salary;
		this.store_ID=store_ID;
		this.location=location;
	}
	
	

	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public int getEmployee_ID() {
		return employee_ID;
	}

	public void setEmployee_ID(int employee_ID) {
		this.employee_ID = employee_ID;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getStore_ID() {
		return store_ID;
	}

	public void setStore_ID(int store_ID) {
		this.store_ID = store_ID;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}
	
}
