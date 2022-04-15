package Friday;

public class StudentExample {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 18;
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		s2.name = "강감찬";
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}

}
