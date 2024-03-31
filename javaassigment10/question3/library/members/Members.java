package javaassigment10.question3.library.members;

public class Members {
	private String name;
	private int id;
	private String type;
	private long phoneNumber;
	private String address;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	@Override
	public String toString() {
		return "\nMembers Details : Name = " + name + "\n id=" + id + "\n Type of the Member = " + type + "\n Phone Number = " + phoneNumber + "\n Address="
				+ address;
	}

}
