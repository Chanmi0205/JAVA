package day10;

public class A {
	
	B returnB() {
		B test = new B();
		return test;
	}
	
	static class B {

		String name;
		
		void sayHI() {
			System.out.println("하이~~~");
		}
		
		static int a;
		
		static void sayBye() {
			System.out.println("바이~~~");
		}
		
		A test2 = new A();
		
	}
}
