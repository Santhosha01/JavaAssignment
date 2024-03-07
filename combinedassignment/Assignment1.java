package combinedassignment;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter 10 People Weights ");
		int totalWeight=0;
		int noOfWeights[]=new int[10];
		for (int i = 0; i < 10; i++) {
			noOfWeights[i]=sc.nextInt();
			totalWeight+=noOfWeights[i];
		}
		System.out.println("Average weight of 10 people is "+totalWeight/10);
	}

}
