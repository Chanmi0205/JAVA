package submit;

public class Test040204 {
	public static void main(String[] args) {
		// ��ø for���� �̿��Ͽ� ������ 4x + 5y = 60�� ��� �ظ� ���ؼ� (x, y) ���·�
		// ����غ�����. ��, x�� y�� 10 ������ �ڿ����Դϴ�.
		
		int x, y;
		
		for (x=0; x<=10; x++) {
			for (y=0; y<=10; y++ ) {
				if ( (4*x + 5*y) == 60 ) {
					System.out.println(x + ", " + y);
					System.out.println("-------------");
				}
			}
		}
	}

}
