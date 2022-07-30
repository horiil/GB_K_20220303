package arraylist;

// 3.
public class Student {
	private String name;
	private String phone;
	private String address;
	
	// 4.
	public Student(String name, String phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	// 5. 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	// 6.
	@Override
	public String toString() {
		return "[" + "이름 : " + this.name + ", 전화번호 : " + this.phone
				+ ", 주소 : " + this.address + "]";
	}

	
	
}
