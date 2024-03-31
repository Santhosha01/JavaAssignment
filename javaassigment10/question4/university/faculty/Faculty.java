package javaassigment10.question4.university.faculty;

import javaassigment10.question4.university.courses.Courses;

public class Faculty {
	private String name;
	private int id;
	private long phoneNumber;
	private String address;
    private Courses course;
    
	
	@Override
	public String toString() {
		return "Faculty [name=" + name + ", id=" + id + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", course=" + course + "]";
	}

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
