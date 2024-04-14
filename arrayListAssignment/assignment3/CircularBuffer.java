package arrayListAssignment.assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CircularBuffer {
   static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Capacity of the ArrayList");
		int capacity=sc.nextInt();
		List<String> cb=new ArrayList<String>(capacity);
		System.out.println("Enter the Number of the messages you want add");
		int msglen=sc.nextInt();
		sc.nextLine();
		int index=0;
	   for(int i=0;i<msglen;i++) {
		   System.out.println("Enter your message");
		   String str=sc.nextLine();
		   if(cb.size()>=capacity)
		   {  cb.set(index, str);}
		   else {
		   cb.add(str);
		   }
		   index=(index+1)%capacity;
		   }
	   System.out.println(cb);
	   }
	   
	}
