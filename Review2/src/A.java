
public class A {
	
	// 멤버 변수(필드)
	String name;
	int age;
	
	// 디폴트 생성자
	public A() {}

	// 생성자
	public A(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 메서드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "A [name=" + name + ", age=" + age + "]";
	}

}
