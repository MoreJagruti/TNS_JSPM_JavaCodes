package comdayFive.singleInheritance;

public class Citizen {
	
	private String name;
	private long aadharNo;
	private String address;
	private long phno;
	

	public Citizen() {
		System.out.println("Citizen object is created\n");
	}
	
	

	public Citizen(String name, long aadharNo, String address, long phno) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		this.phno = phno;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public long getAadharNo() {
		return aadharNo;
	}



	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public long getPhno() {
		return phno;
	}



	public void setPhno(long phno) {
		this.phno = phno;
	}



	public static void main(String[] args) {
		

	}

}
