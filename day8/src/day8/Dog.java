package day8;

public class Dog extends Animal {
	
	Dog() {}
	
	Dog(String name) {
		super(name);
	}
 
	@Override
	void say() {
		System.out.println("woof");
	}
}
