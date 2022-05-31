package parents;

public class Player {
	
	protected int hp;
	protected int mp;
	
	final String name = "chanmi";
	
	public Player(int hp, int mp) {
		System.out.println("Player is called");
		this.hp = hp;
		this.mp = mp;
	}
	 
	// final <= µ¤¿©¾º¿ï ¼ö ¾ø´Ù
	public void attack() {
		System.out.println("punch!");
	}

}
