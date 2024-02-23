package JavaAssignment4;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the range to find the Prime Number");
		int start=in.nextInt();
		int end=in.nextInt();
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	public static boolean isPrime(int a) {
		int count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		return false;
	}
}
