package inheritence;

import parents.Player;

public class Warrior extends Player {
	
//	int hp;
//	int mp;
//	
//	void attack() {
//		System.out.println("attack!");
//	}
	
	public Warrior(int hp, int mp) {
		super(hp, mp);
		// TODO Auto-generated constructor stub
	}

	void dash() {
		System.out.println("dash!");
	}

}
