package submit;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		
		Warrior student = new Warrior("������");
		Magician magic = new Magician("������");
		Thief enemy = new Thief("������");
		
		Monster java = new Monster("java");
		
		while (java.hp > 0) {
			Scanner input = new Scanner(System.in);
			String userInput2 = input.nextLine();
			if( userInput2.equals("������") || userInput2.equals("������") || userInput2.equals("����")) {
				
				if ( userInput2.equals("������") )
					student.attack(java);		
				
				if ( userInput2.equals("������") ) 
					magic.attack(java);	
				
				if ( userInput2.equals("����") )
					enemy.attack(java);
				
			} else {
				System.out.println("�߸��� �Է°��Դϴ�.");
			}
		}
		System.out.println("������ �������ϴ�.");
	}

}
