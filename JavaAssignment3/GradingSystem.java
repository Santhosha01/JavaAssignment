package JavaAssignment3;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student score");
		int studentScore=sc.nextInt();
		if(studentScore>=90&&studentScore<100) {
			System.out.println("Grade \"O\"");   
		}
		else if(studentScore>=80&&studentScore<90){
			System.out.println("Grade \"A\"" );
		}
		else if(studentScore>=70&&studentScore<60){
			System.out.println("Grade \"B\"" );
		}
		else if(studentScore>=60&&studentScore<50){
			System.out.println("Grade \"C\"" );
		}
		else{
			System.out.println("Fail" );
		}
	}

}
