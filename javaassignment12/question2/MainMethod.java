package javaassignment12.question2;

import java.util.Scanner;

public class MainMethod {
	static Scanner sc=new Scanner(System.in);
  public static void main(String[] args) {
	  System.out.println("\nEmployee Details\n");
		System.out.println("Enter the Employee Name");
		String name1 = sc.nextLine();
		System.out.println("Enter the Employee ID");
		int empId1 = sc.nextInt();
		System.out.println("Enter the Employee Phone Number");
		long phoneNumber1 = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the Employee Type");
		String empType1 = sc.nextLine();
		System.out.println("Enter your Salary per Month");
        long salary=sc.nextLong();
        sc.nextLine();
		Employee e1 = new HourlyEmployee(name1, empId1, phoneNumber1, empType1);
		e1.getDetails();
		e1.calculatePay(salary);
		
		System.out.println("\nEmployee Details\n");
		System.out.println("Enter the Employee Name");
		String name2 = sc.nextLine();
		System.out.println("Enter the Employee ID");
		int empId2 = sc.nextInt();
		System.out.println("Enter the Employee Phone Number");
		long phoneNumber2 = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the Employee Type");
		String empType2 = sc.nextLine();
		System.out.println("Enter your Salary per Month");
        long salary1=sc.nextLong();
		Employee e2 = new SalariedEmployee(name2, empId2, phoneNumber2, empType2);
		e2.getDetails();
		e2.calculatePay(salary1);
  }
}
