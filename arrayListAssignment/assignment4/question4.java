package arrayListAssignment.assignment4;

import java.util.ArrayList;
import java.util.List;

public class question4 {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>(100);
		long start=System.nanoTime();
		for(int i=0;i<l1.size();i++) {
			l1.add(i);
		}
		long end=System.nanoTime();
		long foriterationtime=end-start;
		System.out.println("Random Access Time taken = "+foriterationtime);
		List<Integer> l2=new ArrayList<Integer>(100);
		long start1=System.nanoTime();
		for(int i:l2) {
			l2.add(i);
		}
		long end1=System.nanoTime();
		long foreachiterationtime=end1-start1;
		System.out.println("Sequential Access Time Taken = "+foreachiterationtime);
	}

}
