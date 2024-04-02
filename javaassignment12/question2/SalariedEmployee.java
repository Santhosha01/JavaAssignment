package javaassignment12.question2;

public class SalariedEmployee extends Employee{
	String empType;
    long salary;
	public SalariedEmployee(String empName, int empId, long phoneNumber, String empType) {
		super(empName, empId, phoneNumber);
		this.empType = empType;
	}
	public void getDetails() {
		System.out.println("\nEmployee Details : \n\nEmployee Name = " + empName + "\nEmployee ID = "
				+ empId + "\nPhone Number = " + phoneNumber + "\nEmployee Type = "
				+ empType + "\nCompany = " + company);
	}
	@Override
	void calculatePay(long salary) {
		long amount=salary*12;
		System.out.println("Annual Salary of the Employee = "+amount);
	}
   	
}
