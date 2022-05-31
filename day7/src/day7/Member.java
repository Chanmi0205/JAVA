package day7;

public class Member {
	
	private String name;
	private int age;
	
	public Member() {}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name.length() > 5) { 
			this.name = name.substring(0, 5);
		} else {
			this.name = name;
		}
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<=0) {
			this.age = 1;			
		} else {
			this.age = age;
		}
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

}