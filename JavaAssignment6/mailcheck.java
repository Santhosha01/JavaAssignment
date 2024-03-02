package JavaAssignment6;

import java.util.Scanner;

public class mailcheck {

	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		System.out.println("Enter the Mail ID");
		String mailId=inScanner.nextLine().toLowerCase();
		if(!(mailId.charAt(0)>='0'&&mailId.charAt(0)<='9'&&mailId.charAt(0)=='@')&&mailId.contains("@")&&mailId.length()>=6&&Checking(mailId)) {
			System.out.println("valid");
		}
		else{
			System.out.println("not valid");
		}
	}
	static boolean Checking(String mailId) { 
		int countAt=0,countdot=0;
		for (int i = 0; i < mailId.length(); i++) {
			if(mailId.charAt(i)=='.') {
				if(i+1<mailId.length()&&mailId.charAt(i+1)=='.') {
					return false;
				}
			}
			if(((mailId.charAt(i)>=32&&mailId.charAt(i)<=45)||(mailId.charAt(i)==47)||(mailId.charAt(i)>=58&&		
					mailId.charAt(i)<=63)||(mailId.charAt(i)>=91&&mailId.charAt(i)<=96)||(mailId.charAt(i)>=123&&mailId.charAt(i)<=126))) {
				return false;
			}
			if(mailId.charAt(i)==64) {
				countAt++;
				if(countAt>=2) {
					return false;
				}
				if(((i-1)<mailId.length()&&mailId.charAt(i-1)=='.')||
						((i+1)<mailId.length()&&mailId.charAt(i+1)=='.')){
					return false;
				}
				int j=i;
				while(j+1<mailId.length()) {
					if(mailId.charAt(j+1)>='0'&&mailId.charAt(j+1)<='9') {
						return false;
					}
					if(mailId.charAt(j+1)=='.'){
						countdot++;
					}
					j++;
				}
				if(countdot>2) {
					return false;
				}
			}
		}
		return true;
	}
}
