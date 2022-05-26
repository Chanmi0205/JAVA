package submit;

public class Member {
	
	public String name;
	public String id;
	public String password;
	public int age;
	
	public Member() {}
	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + "]";
	}

}