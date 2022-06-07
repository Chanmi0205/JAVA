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
        		System.out.println(this.name + "가 " + java.name + " 몬스터를 때려 " + java.name + "가 "+ java.hp +"hp만큼 남았습니다.");        	
        	}
        
        	else if ( java.hp <= 0 ) {
        		System.out.println(this.name + "가 " + java.name + " 몬스터를 때려 " + java.name + "가 죽었습니다.");
        		java.hp = 0;
        	}
        
    	}
    }
     
	public void defense() {
        this.mp -= 10;
    }

}