package submit;

public class Student extends Person {
	
	private int studentID = 20304;
	
	public Student() {}
	
	public Student(String name, int age) {
		// super Ű���带 ���������μ�(extends�� ���༭) �� �ڵ忡�� this.getName()�� ����� �� ����.
		super(name, age);
	}
	
	@Override
	public void printInfo() {
		System.out.println("�̸� : " + this.getName() + ", ���� : " + this.getAge() + ", �й� : " + this.studentID);
	}

}