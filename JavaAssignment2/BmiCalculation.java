package JavaAssignment2;

import java.util.Scanner;

public class BmiCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter your height in Meter ");
		double height=sc.nextDouble();
		System.out.println("Enter the weight in kg");
		double weight=sc.nextDouble();
		double bmi = (weight/(height*height));
		System.out.println("Your  Body Mass Index(BMI) = "+String.format("%.1f",bmi));
	}

}
