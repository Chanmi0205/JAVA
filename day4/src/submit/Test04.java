package submit;

public class Test04 {
	public static void main(String[] args) {
		
		Student group[] = new Student[4];

		// ���� �����
		for(int i=0; i<group.length; i++) {
			group[i] = new Student();
		}
		
		// �� ��ҿ� �̸��� ���� �ֱ�
		for(int i=0; i<group.length; i++) {
			group[i].student = "a";
			group[i].age = 17;
		}
		
		// �� �� �Ա� �� ���
		for (int j=0; j<group.length; j++) {
			System.out.println(group[j].student+", "+group[j].age);
		}
		
		// �� �� �԰� ���
		for(int j=0; j<group.length; j++) {
			group[j].age += 1;
		}
		
		// �� �� ���� �� ���
		for (int j=0; j<group.length; j++) {
			System.out.println(group[j].student+", "+group[j].age);
		}
	
	}
}