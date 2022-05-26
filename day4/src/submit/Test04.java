package submit;

public class Test04 {
	public static void main(String[] args) {
		
		Student group[] = new Student[4];

		// 공간 만들기
		for(int i=0; i<group.length; i++) {
			group[i] = new Student();
		}
		
		// 각 요소에 이름과 나이 넣기
		for(int i=0; i<group.length; i++) {
			group[i].student = "a";
			group[i].age = 17;
		}
		
		// 한 살 먹기 전 출력
		for (int j=0; j<group.length; j++) {
			System.out.println(group[j].student+", "+group[j].age);
		}
		
		// 한 살 먹고 출력
		for(int j=0; j<group.length; j++) {
			group[j].age += 1;
		}
		
		// 한 살 먹은 후 출력
		for (int j=0; j<group.length; j++) {
			System.out.println(group[j].student+", "+group[j].age);
		}
	
	}
}