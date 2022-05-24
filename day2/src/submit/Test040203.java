package submit;

public class Test040203 {
	public static void main(String[] args) {
		
		// while문과 Math.random() 메서드를 이용해서 2개의 주사위를 던졌을 때
		// 나온는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고,
		// 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요. 
		// 눈의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2)입니다.
		
		int num1 = (int)(Math.random() * 6) + 1;
		int num2 = (int)(Math.random() * 6) + 1;
		
		while(true) {
			
			num1 = (int)(Math.random() * 6) + 1;
			num2 = (int)(Math.random() * 6) + 1;
			System.out.println(num1 + ", " + num2);
			
			if (num1 + num2 == 5)
				break;
		}
		System.out.println("눈1 :" + num1 + ", 눈2 : " + num2);
	}

}
