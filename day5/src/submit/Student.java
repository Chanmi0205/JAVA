package submit;

public class Student {
	
	//�ʵ�
	public String name;
	public int age;
	
	// ������
	public Student(String name, int age) {
		this.name = name;
		this.age =age;
	}
	// �޼���(X)
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
