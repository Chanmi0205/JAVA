package submit;

public class Test040203 {
	public static void main(String[] args) {
		
		// while���� Math.random() �޼��带 �̿��ؼ� 2���� �ֻ����� ������ ��
		// ���´� ���� (��1, ��2) ���·� ����ϰ�, ���� ���� 5�� �ƴϸ� ��� �ֻ����� ������,
		// ���� ���� 5�̸� ������ ���ߴ� �ڵ带 �ۼ��غ�����. 
		// ���� ���� 5�� �Ǵ� ������ (1,4), (4,1), (2,3), (3,2)�Դϴ�.
		
		int num1 = (int)(Math.random() * 6) + 1;
		int num2 = (int)(Math.random() * 6) + 1;
		
		while(true) {
			
			num1 = (int)(Math.random() * 6) + 1;
			num2 = (int)(Math.random() * 6) + 1;
			System.out.println(num1 + ", " + num2);
			
			if (num1 + num2 == 5)
				break;
		}
		System.out.println("��1 :" + num1 + ", ��2 : " + num2);
	}

}
