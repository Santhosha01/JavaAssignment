package JavaAssignment5;

import java.util.Arrays;
import java.util.Scanner;

public class rightrotate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int len = in.nextInt();
		System.out.println("Enter the array elements");
		int arr[] = new int[len];
		for (int j = 0; j < arr.length; j++) {
			arr[j] = in.nextInt();
		}
		System.out.println("Enter the value you want to right rotate");
		int rotate = in.nextInt();
		for (int i = 0; i < rotate; i++) {
			int temp = 0;
			for (int j = 1; j < arr.length; j++) {
				temp=arr[0];
				arr[0]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
