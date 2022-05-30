package submit;

public class Player {
	public String name;
	public int hp;
	public int mp;
	public int str;
	public String type;
	
	final String[] TYPE = {"WATER", "FIRE", "EARTH", "AIP"};
	
	public Player() {}
	
	public Player(String name) {
		this.name = name;
		this.hp = 100;
		this.mp = 20;
		this.str = 10;
		
		int test2 = (int)(Math.random() * (this.TYPE.length));
		type = TYPE[test2];
	}
	
	public void attack(Monster monster) {
		monster.hp -= this.str;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", hp=" + hp + ", mp=" + mp + ", str=" + str + ", type=" + type + "]";
	}

	
	
	

}
