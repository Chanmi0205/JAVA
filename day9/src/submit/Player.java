package submit;

public class Player {
	public int hp;
    public int mp;
    public int str;
    //public String type;
    //final private String[] TYPE = {"FIRE", "WATER", "EARTH", "AIR"};
    String name = null;
    
    public Player() {}
    
    public Player(String name) {
        this.name = name;
        this.hp = 100;
        this.mp = 100;
        this.str = 10;
        //this.type = this.TYPE[((int) (Math.random() * (this.TYPE.length)))];
        
    }
    
    public void attack(Monster java) {
    	
    	if ( java.hp > 0 ) {
        java.hp -= this.str;
        
        	if ( java.hp > 0 ) {
        		System.out.println(this.name + "�� " + java.name + " ���͸� ���� " + java.name + "�� "+ java.hp +"hp��ŭ ���ҽ��ϴ�.");        	
        	}
        
        	else if ( java.hp <= 0 ) {
        		System.out.println(this.name + "�� " + java.name + " ���͸� ���� " + java.name + "�� �׾����ϴ�.");
        		java.hp = 0;
        	}
        
    	}
    }
     
	public void defense() {
        this.mp -= 10;
    }

}