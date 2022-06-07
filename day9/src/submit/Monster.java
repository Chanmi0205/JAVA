package submit;

public class Monster {
	 	public String name;
	    public int str = 10;
	    public int hp = 100;
	    public int mp = 100;
	    //public String type = null;
	    //final private String[] TYPE = {"FIRE", "WATER", "EARTH", "AIR"};
	    
	    public Monster(String name) {
	        this.name = name;
	        this.str = 10;
	        this.hp = 100;
	        this.mp = 100;
	        //this.type = this.TYPE[((int) (Math.random() * (this.TYPE.length)))];
	        
	    }
	    
	    public void attack(Player player) {
	        player.hp -= this.str;
	    }
	    
	    public void defense() {
	        System.out.println("defense");
	    }
	    
	    public void attackAll(Player[] party) {
	        for (int i = 0; i < party.length; i++) {
	            this.attack(party[i]);
	        }
	    }

}
