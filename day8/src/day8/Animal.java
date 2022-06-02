package day8;

public class Animal {
	
	Animal() {}
	
	String name;
	
	Animal(String name) {
		this.name = name;
	}
 	
	void say() {
		System.out.println("뭔가를 말함");
	}
	
	void test() {
		System.out.println("test입니다.");
	}
	
	void attack(Animal a) {
		System.out.println(this.name + a.name + "을 공격!");
	}
}
