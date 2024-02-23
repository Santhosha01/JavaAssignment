package JavaAssignment4;

import java.util.Scanner;

public class FindtheSecondOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);	
		System.out.println("Enter the Length of the array");
		int len=in.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter the value");
		int num=in.nextInt();
		int count=0;
		System.out.println("Enter the elements in the array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
			if(arr[i]==num) {
				count++;
				if(count==2) {
					System.out.println("The Second occurence of the Number "+num+" is in "+i+" index.");
				}
			}
		}
		if(count==0) {
			System.out.println("The Given Number "+num+" is not in the array.");
		}
		if(count==1) {
			System.out.println("The Given Number "+num+" is occurs only once.");
		}
	}

}
