
public class B extends A {
	
	// ��� ����(�ʵ�)
	String gender;
	
	// ����Ʈ ������
	public B() {}
	
	// ������
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
