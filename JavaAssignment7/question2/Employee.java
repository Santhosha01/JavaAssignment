package encapsulation.question2;

public class Employee {
	private String empName;
	private int empId;
	private double salary;
	private static String company = "zoho";
	private long phoneNumber;

	public String getEmpName() {
		return empName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void getDetails() {
		System.out.println("\nEmployee Details : \n\n Employee Name = " + empName + "\n Employee Id = " + empId
				+ "\n Employee Salary = " + salary + " \n Employee Phone Number = " + phoneNumber + " \n Company = "
				+ company + "\n");
	}

}
