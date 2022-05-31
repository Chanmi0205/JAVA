package day7;

public class Test {
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static int minus(int a, int b) {
		return a-b;
	}
	static int calcul(int a, int b) {
		int result = add(a, b);
		result = minus(result, a);
		return result;
	}
	
//  1번째 방법
	String writer = "yeji";
//  2번째 방법
	static String writer2 = "chanmi";
	
	public static void main(String[] args) {
		
		System.out.println(add(2, 3));
		System.out.println(add(7, 5));
		//Queue, stack
		// stack (main->add->main)
		
		// 1번째 방법
		Test test = new Test();
		System.out.println(test.writer);
		
		writer2 = "test";
		// 2번째 방법
		System.out.println(writer2);
		
		// 이렇게 접근해서 사용할 수 있음
//		Car c1 = new Car();
		
		// 메서드 영역에 저장되어 있음
//		c1.setSpped(30);
		
		int circleValue = 10;                          // 클래스 이름으로 접근할 수 있음.
		System.out.println(circleValue * circleValue * Carculator.pi);
		
		System.out.println(Carculator.plus(3, 4));
		
		
	}

}