package day8;

public class Cat extends Animal {
	
	Cat() {}
	
	Cat(String name) {
		super(name);
	}
	
	@Override
	void say() {
		System.out.println("meow");
	}
	
	void nightSee() {
		System.out.println("See at night well");
	}

}
