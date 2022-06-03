package day8;
       // 추상적인
public abstract class Animal {
	
	Animal() {}
	
	String name;
	
	Animal(String name) {
		this.name = name;
	}
 	
	abstract void say();
	
	void test() {
		System.out.println("test입니다.");
	}
	
	void attack(Animal a) {
		System.out.println(this.name + a.name + "을 공격!");
	}
}
