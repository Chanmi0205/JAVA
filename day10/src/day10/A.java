package day10;

public class A {
	
	B returnB() {
		B test = new B();
		return test;
	}
	
	static class B {

		String name;
		
		void sayHI() {
			System.out.println("����~~~");
		}
		
		static int a;
		
		static void sayBye() {
			System.out.println("����~~~");
		}
		
		A test2 = new A();
		
	}
}
