package submit;

public class MonsterTest {
	public static void main(String[] args) {
		
//		Monster chan = new Monster();
//		
//		chan.attack();
//		chan.defense();
		
		Monster slime = new Monster();
		
		Player party[] = new Player[3];
		
		for(int i=0; i<party.length; i++) {
			party[i] = new Player("player"+ (i+1));
		}
		
		for(int i=0; i<party.length; i++) {
			System.out.println(party[i].toString());
		}
		
		System.out.println("-------------------------------");
		
		slime.attackAll(party);
		
		for(int i=0; i<party.length; i++) {
			System.out.println(party[i].toString());
		}
		
		System.out.println("-------------------------------");
		
		System.out.println(slime.toString());
		
		party[0].attack(slime);
		
		System.out.println("-------------------------------");
		
		System.out.println(slime.toString());
		
		
	}

}