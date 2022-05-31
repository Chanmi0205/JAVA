package inheritence;

import parents.Player;

public class Magician extends Player {
	
//	int hp;
//	int mp;
//	 
//	void attack() {
//		System.out.println("attack!");
//	}
	
	public Magician() {
		super(100, 2000);
		System.out.println("Magician is called");
	}
	
	 
	public void fireball() {
		System.out.println("fireball");
	}

	@Override
	public void attack() {
		System.out.println("wand punch");
	}

}
