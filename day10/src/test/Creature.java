package test;

public abstract class Creature {
	
	int x;
	int y;
	int age;
	
	public Creature(int x, int y, int age) {
		this.x = x;
		this.y = y;
		this.age = age;
	}
	
	abstract void attack();
	
	void printInfo() {
		System.out.println(x + ", "  + y + ", " + age);
	}

}
