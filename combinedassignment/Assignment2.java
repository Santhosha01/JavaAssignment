package combinedassignment;

public class Assignment2 {

	public static void main(String[] args) {
		int variable=10;
		if(true) {
			int localVar=5;
			System.out.println("Local Variable which is inside the block : "+localVar);
		}
		//System.out.println(localVar); 
		//	In line 14 we will get compiler error,localVar is a Local variable which is created inside the block so we can't access the local variable outside the block because outside the block it will be destroyed
		System.out.println("Local Variable which is outside the block : "+variable);
	}

}
