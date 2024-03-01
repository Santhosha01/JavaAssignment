package JavaAssignment5;

import java.util.Scanner;

public class transpose {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the row of the array");
		int row=in.nextInt();
		System.out.println("Enter the column of the array");
		int col=in.nextInt();
		System.out.println("Enter the array elements");
		int arr[][]=new int[row][col];
		int ans[][]=new int[col][row];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++) {
				arr[i][j]=in.nextInt();
				ans[j][i]=arr[i][j];
			}
		}
		for(int i=0;i<col;i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}

}
