
public class Test04 {
public static void main(String[] args) {
		
		
		String str1 = "java";
		String str2 = "java";

		// ���� Ÿ���� ���� �� �ּҰ��� ����
		if (str1 == str2) {
			System.out.println("���� �ּ��� ���� ���� �ֽ��ϴ�.");
		}
		
		if (str1.equals(str2)) {
			System.out.println("�ȿ� ����ִ� ���� ������ �����ϴ�!");
		}
		
		System.out.println("---------------------");
		
		String str3 = new String("java");
		
		if (str1 == str3) {
			System.out.println("�ּ����� �޶� ����� �ȵ˴ϴ�.");
		}
		
		// equals�� �ȿ� �ִ� ������ ���ϴ� �Լ��̴�.
		if (str1.equals(str3)) {
			System.out.println("�ȿ� ����ִ� ���� ������ �����ϴ�!");
		}
		
		System.out.println("---------------------");
		String str5 = null;
		
		// String.out.println(str5.length()); ����. null���̱� ������
		
		if (str5 == null) {
			System.out.println("�����ϴ�:)");
		}
		
		System.out.println(str1.substring(3)); // �տ��� ���� 3���� �ڸ��� �����
		System.out.println(str1.concat("Hello ")); // ���� �־��� ������ �̾����
		
	}

}
