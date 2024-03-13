package problemsolving1;
import java.util.Scanner;

public class Squareroot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		for (int i = 1; i < num; i++) {
			if(i*i==num) {
				System.out.println(i);
				break;
			}
			if(i*i>num) {
				int curcheck=i*i;
				int current=curcheck-num;
				int precheck=(i-1)*(i-1);
				int previous=num-precheck;
				if(current<previous) {
					System.out.println(i);
					break;
				}
				else {
					System.out.println(i-1);
					break;
				}
			}
		}
	}

}
