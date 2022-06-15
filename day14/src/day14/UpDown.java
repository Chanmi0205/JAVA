package day14;

import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		
		int number = (int)(Math.random()*50)+1;
		
		System.out.println("1부터 50까지 숫자 중 하나를 맞춰보세요.");
		
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
				System.out.println("예상치 못한 오류가 발생하였습니다.");
				break;
				
			}
			
			if ( number == input )
			System.out.println("정답!");
			
		}
		
	}

}
