package Friday;

public class StudentExample {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "ȫ�浿";
		s1.age = 18;
		System.out.println("s1 ������ Student ��ü�� �����մϴ�.");
		
		Student s2 = new Student();
		s2.name = "������";
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println("s2 ������ �� �ٸ� Student ��ü�� �����մϴ�.");
	}

}
