package arrayListAssignment.assignment5;

public class Employee {
  private String name;
  private int empId;
  private double salary;
  private char grade;
  public Employee(String name,int empId,char grade,double salary) {
	  this.name=name;
	  this.empId=empId;
	  this.grade=grade;
	  this.salary=salary;
  }
@Override
public String toString() {
	return " Employee Name = " + name + "\n Emp Id = " + empId + "\n Salary = " + salary + "\n Grade=" + grade + "\n";
  }
public String getName() {
	return name;
}

public int getEmpId() {
	return empId;
}

public double getSalary() {
	return salary;
}

public char getGrade() {
	return grade;
}

  
}
