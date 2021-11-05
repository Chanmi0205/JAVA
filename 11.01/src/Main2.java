import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		if ( a % 10 == 0 && a > 0 )
		System.out.println("이 값은 10의 배수입니다.");
		
		if ( a % 10 != 0 && a > 0 )
		System.out.println("이 값은 10의 배수가 아닙니다.");
		
		if ( a == 0 )
		System.out.println("이 값은 0입니다.");	
		
		if ( a < 0 )
		System.out.println("이 값은 음수값입니다.");	
		
	}

}
