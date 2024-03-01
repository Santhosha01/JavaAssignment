package JavaAssignment5;

import java.util.Scanner;

public class matrixmultiplication {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the row of the array1 ");
		int row1=in.nextInt();
		System.out.println("Enter the column of the array1 ");
		int col1=in.nextInt();
		int a[][]=new int[row1][col1];
		System.out.println("Enter the array1 elements"); 
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				a[i][j]=in.nextInt();		
			}
		}
		System.out.println("Enter the row of the array2 ");
		int row2=in.nextInt();
		System.out.println("Enter the column of the array2 ");
		int col2=in.nextInt();
		int b[][]=new int[row2][col2];
		System.out.println("Enter the array2 elements"); 
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				b[i][j]=in.nextInt();
			}
		}
		System.out.println();
		if(col1==row2) {
			int sum=0;
			int ans[][]=new int[row1][col2];
			for (int i = 0; i < row1; i++) { 
				for (int j = 0; j < col2; j++) { 
					for (int k = 0; k < row2; k++) {
						ans[i][j] += a[i][k] * b[k][j]; 
						System.out.print(ans[i][j]+" ");
					}
				}
				System.out.println();
			} 
		}
		else {
			System.out.println("This Two Matrixs cannot be multiply");
		}
	}

}
