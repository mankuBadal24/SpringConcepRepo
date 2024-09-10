package in.spac.beans;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private String name;
	private int rollno;
//	@Autowired
//	@Qualifier("createAddrObj")
	private Address address;
public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	//	@Autowired
//	@Qualifier("createAddrObj1")
	private Address address1;
//	@Autowired
	private Subjects subjects;
public Address getAddress1() {
		return address1;
	}
	public void setAddress1(Address address1) {
		this.address1 = address1;
	}
	//	@Autowired
	private Caste caste;
	public Subjects getSubjects() {
		return subjects;
	}
	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}
	public Caste getCaste() {
		return caste;
	}
	public void setCaste(Caste caste) {
		this.caste = caste;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	
	public void display() {
		System.out.println("Name is : "+name);
		System.out.println("Roll no. is : "+rollno);
		System.out.println("First Address is : "+address);
		System.out.println("Second Address is : "+address1);
		System.out.println("Subjects are : "+subjects);
		System.out.println("Caste is : "+caste);
	}
}
