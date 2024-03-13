package problemsolving1;
import java.util.Scanner;

public class Oneofmyfav {

	public static void main(String[] args) {
	System.out.println("Enter the Number");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println(a);
	while(a!=1) {
		if(a%2==0) {
			a=a/2;
		}
		else if(a%2!=0) {
			a=3*a+1;
		}
		System.out.println(a);
	}
	}

}
