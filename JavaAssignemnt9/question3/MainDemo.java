package Polymorphism.question3;

import java.util.Scanner;

public class MainDemo {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the Employee Name");
		String name = sc.nextLine();
		System.out.println("Enter the Employee ID");
		int empId = sc.nextInt();
		System.out.println("Enter the Employee Phone Number");
		long phoneNumber = sc.nextLong();
		Employee e = new Employee(name, empId, phoneNumber);
		e.getDetails();
		sc.nextLine();
		System.out.println("\nHourly Employee Details\n");
		System.out.println("Enter the Employee Name");
		String name1 = sc.nextLine();
		System.out.println("Enter the Employee ID");
		int empId1 = sc.nextInt();
		System.out.println("Enter the Employee Phone Number");
		long phoneNumber1 = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the Employee Type");
		String empType1 = sc.nextLine();
		Employee e1 = new HourlyEmployee(name1, empId1, phoneNumber1, empType1);
		e1.getDetails();
		
		System.out.println("\nSalaried Employee Details\n");
		System.out.println("Enter the Employee Name");
		String name2 = sc.nextLine();
		System.out.println("Enter the Employee ID");
		int empId2 = sc.nextInt();
		System.out.println("Enter the Employee Phone Number");
		long phoneNumber2 = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the Employee Type");
		String empType2 = sc.nextLine();
		Employee e2 = new SalariedEmployee(name2, empId2, phoneNumber2, empType2);
		e2.getDetails();
	}
}
