package submit;

public class Monster {
	//�ʵ�
	public int str;
	public int hp;
	public int mp;
	public String type;
	
	final String[] TYPE = {"WATER", "FIRE", "EARTH", "AIP"};
	
	// ������
	public Monster() {
		this.str = 10;
		this.hp = 100;
		this.mp = 20;
		
		int test = (int)(Math.random() * (this.TYPE.length));
		type = TYPE[test];
		
		System.out.println(type + " �� ����");
	}
	
	//�޼���
	public void attack() {
		System.out.println("attack!");
	}
	
	public void attack(Player party) {
		party.hp -= this.str;
	}
	
	public void defense() {
		System.out.println("defense!");
	}
	
	public void attackAll(Player party[]) 	{
		for(int i=0; i<party.length; i++) {
			this.attack(party[i]);
		}
	}

	@Override
	public String toString() {
		return "Monster [str=" + str + ", hp=" + hp + ", mp=" + mp +"]";
	}
	
	

}
