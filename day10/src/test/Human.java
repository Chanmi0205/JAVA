package test;

public abstract class Human extends Creature implements Talkable {
	

	public Human(int x, int y, int age) {
		super(x, y, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	void attack() {
		System.out.println("������ ����");
	}
	
	@Override
	public void talk() {
		System.out.println("������!");
	}


}
