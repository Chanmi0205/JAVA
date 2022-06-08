package test;

public abstract class Animal extends Creature {
	

	public Animal(int x, int y, int age) {
		super(x, y, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	void attack() {
		System.out.println("¸öÅë¹ÚÄ¡±â!");
	}
	

}
