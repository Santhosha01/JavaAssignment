package problemsolving1;
import java.util.Scanner;

public class Alloffbyone {
    static int index=0;
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the length of Array 1");
	    int len1=sc.nextInt();
	    int arr1[]=new int[len1];
	    System.out.println("Enter the Array 1 Element");
	    for (int i = 0; i < len1; i++) {
			arr1[i]=sc.nextInt();
		}
	    System.out.println("Enter the length of Array 2");
	    int len2=sc.nextInt();
	    int arr2[]=new int[len2];
	    System.out.println("Enter the Array 2 Element");
	    for (int i = 0; i < len2; i++) {
			arr2[i]=sc.nextInt();
		}
		System.out.println(allOffByOne(arr1,arr2));
	}
	static boolean allOffByOne(int[] arr1, int[] arr2){
		if(index==arr1.length) {
			return true;
		}
		if(arr1.length!=arr2.length||arr2[index]!=(arr1[index]+1)) {
			return false;
		}
		else {
			index++;//01
		  return allOffByOne(arr1, arr2);
		}
	}
}
