package submit;

public class Test040202 {
	public static void main(String[] args) {
	
	// for���� �̿��ؼ� 1���� 100������ ���� �߿��� 
	//			3�� ����� ������ ���ϴ� �ڵ带 �ۼ��غ�����.
	
		int sum = 0;
		
		for (int i=1; i<=100; i++) {
			if ( i%3==0 ) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
