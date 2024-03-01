package JavaAssignment5;

import java.util.Scanner;

public class sprialmatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int size = sc.nextInt();
		int arr[][]=new int[size][size];
		int start=1,end=size*size;
		int top=0,left=0,right=size-1,bottom=size-1,i=0,j=0,count=0;
		while(start<=end) {
			arr[i][j]=start++;
			if(i<=bottom&&count==0) {
				if(i==bottom) {
					left++;
					count++;
					j++;
				}
				else {
					i++;
				}
			}
			else if(j<=right&&count==1) {
				if(j==right) {
					bottom--;
					count++;
					i--;
				}
				else {
					j++;
				}
			}
			else if(i>=top&&count==2) {
				if(i==top) {
					right--;
					count++;
					j--;
				}
				else {
					i--;
				}
			}
			else if(j>=left&&count==3) {
				if(j==left) {
					top++;
					i++;
					count=0;
				}
				else {
					j--;
				}
			}
		}
		for(int n=0; n<size; n++)  
		{  
			for(int m=0; m<size; m++)  
			{  
				System.out.print(arr[n][m]+" ");  
			}  
			System.out.println();  
		}  
	}  
}


