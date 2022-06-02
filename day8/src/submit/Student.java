package submit;

public class Student extends Person {
	
	private int studentID = 20304;
	
	public Student() {}
	
	public Student(String name, int age) {
		// super 키워드를 적어줌으로서(extends를 해줘서) 밑 코드에서 this.getName()을 사용할 수 있음.
		super(name, age);
	}
	
	@Override
	public void printInfo() {
		System.out.println("이름 : " + this.getName() + ", 나이 : " + this.getAge() + ", 학번 : " + this.studentID);
	}

}