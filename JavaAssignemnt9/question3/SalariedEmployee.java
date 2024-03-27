package Polymorphism.question3;

public class SalariedEmployee extends Employee {
	String empType;

	public SalariedEmployee(String empName, int empId, long phoneNumber, String empType) {
		super(empName, empId, phoneNumber);
		this.empType = empType;
	}
	public void getDetails() {
		System.out.println("\nEmployee Details : \n\nEmployee Name = " + empName + "\nEmployee ID = "
				+ empId + "\nPhone Number = " + phoneNumber + "\nEmployee Type = "
				+ empType + "\nCompany = " + company);
	}
   	
}
