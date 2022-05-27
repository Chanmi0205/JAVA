package submit;

public class Student {
	
	//필드
	public String name;
	public int age;
	
	// 생성자
	public Student(String name, int age) {
		this.name = name;
		this.age =age;
	}
	// 메서드(X)
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
