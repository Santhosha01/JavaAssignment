package Inheritance.question3;

public class Student {
	String studentName;
	int mark;
	String address;

	public Student(String studentName, int mark, String address) {
		this.studentName = studentName;
		this.mark = mark;
		this.address = address;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return mark;
	}

	public void setMarks(int mark) {
		this.mark = mark;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
