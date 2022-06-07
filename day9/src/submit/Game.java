package submit;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		
		Warrior student = new Warrior("마법사");
		Magician magic = new Magician("마술사");
		Thief enemy = new Thief("도둑이");
		
		Monster java = new Monster("java");
		
		while (java.hp > 0) {
			Scanner input = new Scanner(System.in);
			String userInput2 = input.nextLine();
			if( userInput2.equals("마법사") || userInput2.equals("마술사") || userInput2.equals("도둑")) {
				
				if ( userInput2.equals("마법사") )
					student.attack(java);		
				
				if ( userInput2.equals("마술사") ) 
					magic.attack(java);	
				
				if ( userInput2.equals("도둑") )
					enemy.attack(java);
				
			} else {
				System.out.println("잘못된 입력값입니다.");
			}
		}
		System.out.println("전투가 끝났습니다.");
	}

}
