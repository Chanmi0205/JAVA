package day10;

public class C {
	public static void main(String[] args) {
		
		A a1 = new A();
//		A.B a2 = a1.new B();

		A.B b = new A.B();
		b.name = "¾È³ç";
		b.sayHI();
		
		A.B.a = 10;
		A.B.sayBye();
		
		
	}
}
