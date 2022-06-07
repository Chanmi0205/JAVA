package day10;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner test = new Scanner(System.in);
		
		String userInput = test.next();
		// nextInt(), nextDouble(), next() : 공백 이전까지, ...

		String userInput2 = test.nextLine();
		
		System.out.println(userInput);
		System.out.println(userInput2);
			
	}

}
