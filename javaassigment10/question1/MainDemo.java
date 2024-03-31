package javaassigment10.question1;

import java.util.Scanner;

public class MainDemo {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the Length of the Array");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("choose the Sort Methods ");
		System.out.println(" 1.Bubble Sort \n 2.Merge Sort \n 3.Quick Sort");
		System.out.println("Enter your Choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Sortable bs=new BubbleSort();
			System.out.println("Bubble Sort :");
			bs.sort(arr);
			break;
		case 2:
			Sortable ms=new MergeSort();
			System.out.println("Merge Sort :");
			ms.sort(arr);
			break;
		case 3:
			Sortable qs=new QuickSort();
			System.out.println("Quick Sort :");
			qs.sort(arr);
			break;
		}
				
	}

}
