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
	
//  1��° ���
	String writer = "yeji";
//  2��° ���
	static String writer2 = "chanmi";
	
	public static void main(String[] args) {
		
		System.out.println(add(2, 3));
		System.out.println(add(7, 5));
		//Queue, stack
		// stack (main->add->main)
		
		// 1��° ���
		Test test = new Test();
		System.out.println(test.writer);
		
		writer2 = "test";
		// 2��° ���
		System.out.println(writer2);
		
		// �̷��� �����ؼ� ����� �� ����
//		Car c1 = new Car();
		
		// �޼��� ������ ����Ǿ� ����
//		c1.setSpped(30);
		
		int circleValue = 10;                          // Ŭ���� �̸����� ������ �� ����.
		System.out.println(circleValue * circleValue * Carculator.pi);
		
		System.out.println(Carculator.plus(3, 4));
		
		
	}

}