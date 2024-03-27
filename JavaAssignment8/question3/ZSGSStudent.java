package Inheritance.question3;

public class ZSGSStudent extends Student{
	int studentId;
    long phoneNumber;
	public ZSGSStudent(String studentName,int mark,String address,int studentId,long phoneNumber) {
	    super(studentName,mark,address);	
   		this.studentId = studentId;
		this.phoneNumber=phoneNumber;
	}
	@Override
	public String toString() {
		return "ZSGS Student [studentId=" + studentId +", studentName=" + studentName
				+ ", phoneNumber=" + phoneNumber +", mark=" + mark + ", address=" + address + "]";
	}
	
}
