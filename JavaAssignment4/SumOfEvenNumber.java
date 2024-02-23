package JavaAssignment4;

import java.util.Scanner;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);	
		System.out.println("Enter the Length of the array");
		int len=in.nextInt();
		int arr[]=new int[len];
		int sum=0;
		System.out.println("Enter the elements in the array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
			if(arr[i]%2==1) {
				continue;
			}
			sum+=arr[i];
		}
		System.out.println("Sum of Even Number in the Array is "+sum);
	}
}
