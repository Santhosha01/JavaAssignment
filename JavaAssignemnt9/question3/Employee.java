package Polymorphism.question3;

public class Employee {
	protected String empName;
	protected int empId;
	protected long phoneNumber;

	static String company = "zoho";

	public Employee(String empName, int empId, long phoneNumber) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.phoneNumber = phoneNumber;
	}

	public void getDetails() {
		System.out.println("\nEmployee Details : \n\nEmployee Name = " + empName + "\nEmployee ID = " + empId
				+ "\nPhone Number = " + phoneNumber + "\nCompany = " + company);
	}

}
