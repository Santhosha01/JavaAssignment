package combinedassignment;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of persons to compare: ");
		int numofPerson=sc.nextInt();
		String names[]=new String[numofPerson];
		double numofbmi[]=new double[numofPerson];
		for (int i = 0; i < numofPerson; i++) {
			System.out.println("Enter the name of person "+(i+1)+" : ");
			String name=sc.next();
			names[i]=name;
			System.out.println("Enter weight of person "+(i+1)+" in kg: ");
			Double weight=sc.nextDouble();
			System.out.println("Enter height of person "+(i+1)+" in cm: ");
			Double height =sc.nextDouble();
			numofbmi[i]= findTheBmi(weight, height);
		}
		double tempbmi=0;
		String tempname="";
		for (int i = 0; i < numofbmi.length; i++) {
			for (int j = i+1; j < numofbmi.length; j++) {
				if(numofbmi[i]<numofbmi[j]) {
					tempbmi=numofbmi[i];
					numofbmi[i]=numofbmi[j];
					numofbmi[j]=tempbmi;
					tempname=names[i];
					names[i]=names[j];
					names[j]=tempname;
				}
			}
		}
		System.out.println("BMI report in decreasing order: \n");
		System.out.println(" Name"+"\t| "+"BMI"+"\t| "+"Remark");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]+"\t| "+String.format("%.1f", numofbmi[i])+"\t| "+findRemarkForBmi(numofbmi[i]));
		}
	}
	static double findTheBmi(double weight,double height) {
		height=height/100;
		double bmi=(weight/(height*height));
		return bmi;
	}
	static String findRemarkForBmi(double bmi) {
		if (bmi < 18.5) 
			return ("underweight"); 

		else if (bmi >= 18.5 && bmi < 24.9) 
			return ("Normal"); 

		else if (bmi >= 24.9 && bmi < 30) 
			return ("Overweight"); 
		return ("Suffering from Obesity"); 
	}

}
