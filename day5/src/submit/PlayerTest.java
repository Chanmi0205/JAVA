package submit;

public class PlayerTest {
	public static void main(String[] args) {
		
//		Player player1 = new Player("player1");
//		Player player2 = new Player("player2");
//		Player player3 = new Player("player3");
		
//		player1.attack();
//		player1.defense();
		
		// 이름 출력
//		System.out.println(player1.name+" = "+player1.hp+", "+player1.mp);
//		System.out.println(player2.name+" = "+player2.hp+", "+player2.mp);
//		System.out.println(player3.name+" = "+player3.hp+", "+player3.mp);
		
		// 객체 배열
		Player group[] = new Player[3];
		
		// 저장공간 할당
		for(int i=0; i<group.length; i++) {
			group[i] = new Player("player"+ (i+1));
		}
		
//		group[0].name = "player1";
//		group[1].name = "player2";
//		group[2].name = "player3";
		
		// 배열에 이름 삽입
		for(int i=0; i<group.length; i++) {
			group[i].name = "player" + (i+1);
		}
		
		for(int i=0; i<group.length; i++) {
			System.out.println(group[i].name+" = "+group[i].hp+", "+group[i].mp);
		}
		
		System.out.println("----------------");
		
//		for(int i=0; i<group.length; i++) {
//			System.out.println(group[i].toString());
//		}
		
		
//		System.out.println("----------------");
		
//		group[0].attack(group[1].hp);
		
//		group[0].attack(group[1]);
		
		
		Player chanmi = new Player("chanmi");
		Player java = new Player("java");
		
		chanmi.attack(java);
		
		// 출력
		System.out.println(java.toString());
		
		System.out.println("----------------");
		
		group[0].defense(); // 방어
		group[1].attack(group[0]); // 공격
		
		System.out.println(group[0].toString());

		System.out.println("----------------");
		
//		System.out.println(java.toString());
//		java.hp = chanmi.attack(java.hp);
		
	}

}