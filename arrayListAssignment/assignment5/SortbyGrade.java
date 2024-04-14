package arrayListAssignment.assignment5;

import java.util.Comparator;

public class SortbyGrade implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return Character.compare(o1.getGrade(), o2.getGrade());
	}
  
}
