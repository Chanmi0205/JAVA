package day3;

public class Test02 {
	public static void main(String[] args) {
		 
		int[] arr = new int[4];
		
		for(int row=0; row<arr.length; row++) {
			arr[row] = row;
		}
		
		//��ü �ڷᱸ���� ��ȸ�ϵ���!!
		//�� �ڵ�� �Ʒ� �ڵ�� ��Ȯ�� ������ �ڵ��̴�
//		for(int row:arr) {
//			arr[row] = row;
//		}
		
		//for(����� �� : ������ �ڷᱸ��) {}
		for(int value:arr) {
			System.out.print(arr[value] + " ");
		}
	}

}
