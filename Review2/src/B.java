
public class B extends A {
	
	// 멤버 변수(필드)
	String gender;
	
	// 디폴트 생성자
	public B() {}
	
	// 생성자
	public B(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "B [gender=" + gender + ", name=" + name + ", age=" + age + "]";
	}
	

}
