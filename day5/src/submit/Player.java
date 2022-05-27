package submit;

public class Player {
	
	// 필드
	public String name;
	public int hp;
	public int mp;
	int i;
	
	// 생성자
	public Player(String name) {
		this.name = name;
		hp = 100;
		mp = 100;
	}
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", hp=" + hp + ", mp=" + mp + "]";
	}

	// 메서드(함수)
//	public void attack(Player group[int num]) {
//		System.out.println("attack");
//		group[i].hp -= 10;
//  	}
	
	public void defense() {
		this.mp -= 10;
		System.out.println(name+"가 방어하여 "+"mp가 10 감소하여 " + mp + "mp가 되었습니다.");
	}

//	public int attack(int hp2) {
//		hp2 -= 10;
//		return hp2;
//	}

	public void attack(Player player) {
		System.out.println(this.name +"가 " + player.name+"를 공격하였습니다!");
		player.hp -= 10;		
	}

//	public void attack(int hp2) {
//		System.out.println("attack");
//		hp2 -= 10;
//	}


}
