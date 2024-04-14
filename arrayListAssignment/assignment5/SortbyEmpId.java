package arrayListAssignment.assignment5;

import java.util.Comparator;

public class SortbyEmpId implements Comparator<Employee>{

@Override
public int compare(Employee o1, Employee o2) {
	return Integer.compare(o1.getEmpId(), o2.getEmpId());
}
}
