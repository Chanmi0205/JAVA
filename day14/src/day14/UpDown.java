package day14;

import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		
		int number = (int)(Math.random()*50)+1;
		
		System.out.println("1���� 50���� ���� �� �ϳ��� ���纸����.");
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		while( number != input ) {
				
			if ( number < input ) {
				System.out.println("Up");
				input = scan.nextInt();
				
			} else if ( number > input ) {
				System.out.println("Down");
				input = scan.nextInt();
				
			} else {
				System.out.println("����ġ ���� ������ �߻��Ͽ����ϴ�.");
				break;
				
			}
			
			if ( number == input )
			System.out.println("����!");
			
		}
		
	}

}
