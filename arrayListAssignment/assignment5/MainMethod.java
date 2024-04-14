package arrayListAssignment.assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainMethod {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		List<Employee> totalEmp=new ArrayList<Employee>();
		Employee e1=new Employee("Santhosh", 2, 'A', 30000);
		Employee e2=new Employee("Sathish", 1, 'B', 20000);
	   totalEmp.add(e1);
	   totalEmp.add(e2);
	   init(totalEmp);
	}
	public static void print(List<Employee> totalEmp) {
		 for(Employee e:totalEmp) {
			   System.out.println(e);
		   }
	}
	public static void init(List<Employee> totalEmp) {
		System.out.println("Employee Details");
		 System.out.println("\n 1.Sort by Employee Id \n 2.Sort by Employee Name \n 3.Sort by Grade \n 4.Sort by Salary \n 5.View Employees \n 6.Exit");
		   System.out.println("\nEnter your Choice");
		   int choice=sc.nextInt();
		   switch(choice) {
		   case 1:
			   Collections.sort(totalEmp, new SortbyEmpId());
			   print(totalEmp);
			   init(totalEmp);
			   break;
		   case 2:
			   Collections.sort(totalEmp,  new SortbyEmpName());
			   print(totalEmp);
			   init(totalEmp);
			   break;
		   case 3:
	           Collections.sort(totalEmp, new SortbyGrade());
	           print(totalEmp);
	           init(totalEmp);
	           break;
		   case 4:
			   Collections.sort(totalEmp,new SortbySalary());
			   print(totalEmp);
			   init(totalEmp);
			   break;
		   case 5:
			   print(totalEmp);
			   init(totalEmp);
			   break;
		   case 6:
			   System.out.println("Thank you");
			   break;
		   default:
				   System.out.println("Invalid Input");
		   }
	}
}
