package submit;

public class Player {
	
	// �ʵ�
	public String name;
	public int hp;
	public int mp;
	int i;
	
	// ������
	public Player(String name) {
		this.name = name;
		hp = 100;
		mp = 100;
	}
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", hp=" + hp + ", mp=" + mp + "]";
	}

	// �޼���(�Լ�)
//	public void attack(Player group[int num]) {
//		System.out.println("attack");
//		group[i].hp -= 10;
//  	}
	
	public void defense() {
		this.mp -= 10;
		System.out.println(name+"�� ����Ͽ� "+"mp�� 10 �����Ͽ� " + mp + "mp�� �Ǿ����ϴ�.");
	}

//	public int attack(int hp2) {
//		hp2 -= 10;
//		return hp2;
//	}

	public void attack(Player player) {
		System.out.println(this.name +"�� " + player.name+"�� �����Ͽ����ϴ�!");
		player.hp -= 10;		
	}

//	public void attack(int hp2) {
//		System.out.println("attack");
//		hp2 -= 10;
//	}


}
