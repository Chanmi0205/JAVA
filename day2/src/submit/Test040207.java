package submit;

import java.util.Scanner;

public class Test040207 {
	public static void main(String[] args) {
		// while���� Scanner�� �̿��ؼ� Ű����� �Էµ� �����ͷ� ����, ���, ��ȸ, ���� ����� �����ϴ� �ڵ带
		// ()�� �ۼ��غ�����. ���α׷��� �����ϸ� ������ ���� �������� ���;��մϴ�.
		// (Scanner�� nextLin() ���)
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("----------------------");
			System.out.println("����> ");
			
			int num;
			num = scanner.nextInt();
			
			if (num == 1) {
				balance = 10000;
				System.out.println("���ݾ�> " + balance);
			} else if (num == 2) {
				balance = 20000;
				System.out.println("���ݾ�> " + balance);
			} else if (num == 3) {
				balance = 30000;
				System.out.println("���ݾ�> " + balance);
			} else {
				run = false;
			}

		}
		System.out.println("���α׷� ����");
	}
}