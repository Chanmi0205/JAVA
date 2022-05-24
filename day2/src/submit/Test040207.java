package submit;

import java.util.Scanner;

public class Test040207 {
	public static void main(String[] args) {
		// while문과 Scanner를 이용해서 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를
		// ()에 작성해보세요. 프로그램을 실행하면 다음과 같은 실행결과가 나와야합니다.
		// (Scanner의 nextLin() 사용)
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------");
			System.out.println("선택> ");
			
			int num;
			num = scanner.nextInt();
			
			if (num == 1) {
				balance = 10000;
				System.out.println("예금액> " + balance);
			} else if (num == 2) {
				balance = 20000;
				System.out.println("예금액> " + balance);
			} else if (num == 3) {
				balance = 30000;
				System.out.println("예금액> " + balance);
			} else {
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}
}