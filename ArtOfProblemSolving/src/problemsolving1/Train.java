package problemsolving1;
import java.util.Scanner;

public class Train {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String value");
		String str=sc.next();
		int mid=str.length()/2;
		int count=mid+1;
		String ans="";
      for(int i=0;i<str.length();i++) {
    	  if(i<mid) {
    		  String s=""+str.charAt(i);
    		  ans+=s.repeat(count);
              count--;
    	  }
    	  else {
    		  String s=""+str.charAt(i);
    		  ans+=s.repeat(count);
    		  count++;
    	  }
      }
		System.out.println(ans);
	}

}
