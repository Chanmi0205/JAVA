package day8;

public class Animal {
	
	Animal() {}
	
	String name;
	
	Animal(String name) {
		this.name = name;
	}
 	
	void say() {
		System.out.println("������ ����");
	}
	
	void test() {
		System.out.println("test�Դϴ�.");
	}
	
	void attack(Animal a) {
		System.out.println(this.name + a.name + "�� ����!");
	}
}
