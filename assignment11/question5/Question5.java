package assignment11.question5;

public class Question5 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		try {
			System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
