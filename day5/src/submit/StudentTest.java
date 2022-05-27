package submit;

public class StudentTest {
	public static void main(String[] args) {
				
		Student group[] = new Student[4];
		
		for(int i=0; i<group.length; i++) {
			group[i] = new Student("student"+(i+1), 17+i);
		}
		
		for(int i=0; i<group.length; i++) {
			System.out.println(group[i].toString());
		}
		
		System.out.println("----------------");
		
		// 나이 한 살 먹기
		for(int i=0; i<group.length; i++) {
			group[i].age += 1;
			// = group[i].age++;
		}
	
		for(int i=0; i<group.length; i++) {
			System.out.println(group[i].toString());
		}
	}

}
