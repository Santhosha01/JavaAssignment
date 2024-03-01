package JavaAssignment5;

import java.util.Scanner;

public class Minweight {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Number of Person");
		int noofperson=sc.nextInt();
		int[][] persons=new int[noofperson][];
		int[] minWeight=new int[noofperson];
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < persons.length; i++) {
			System.out.println("Enter the No of weights for the Person "+(i+1));
			int noofweight=sc.nextInt();
			persons[i]=new int[noofweight];
			for (int j = 0; j < persons[i].length; j++) {
				System.out.println("Enter the weights of the person "+(i+1));
				persons[i][j]=sc.nextInt();
				if(persons[i][j]<min)
					min=persons[i][j];
			}
			minWeight[i]=min;
			min=Integer.MAX_VALUE;
		}
		System.out.println("Enter the Nth person whose Minimum weight you want");
		int n=sc.nextInt();
		for(int i=0;i<minWeight.length;i++) {
			if(i+1==n)
				System.out.println("The Minimum weight of the person "+n+" is "+minWeight[i]);
		}
	}

}
