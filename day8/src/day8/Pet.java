package day8;

public class Pet extends Animal {
	
	Pet() {}
	
	Pet(String name) {
		super(name);
	}
	
	void cutie() {
		System.out.println("����ֱ�");
	}
	
	@Override
	void say() {
		System.out.println("���");
	}

}