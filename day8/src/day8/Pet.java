package day8;

public class Pet extends Animal {
	
	Pet() {}
	
	Pet(String name) {
		super(name);
	}
	
	void cutie() {
		System.out.println("Àü¹æ¾Ö±³");
	}
	
	@Override
	void say() {
		System.out.println("²ó²ó");
	}

}