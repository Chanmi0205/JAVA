import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		if ( a % 10 == 0 && a > 0 )
		System.out.println("�� ���� 10�� ����Դϴ�.");
		
		if ( a % 10 != 0 && a > 0 )
		System.out.println("�� ���� 10�� ����� �ƴմϴ�.");
		
		if ( a == 0 )
		System.out.println("�� ���� 0�Դϴ�.");	
		
		if ( a < 0 )
		System.out.println("�� ���� �������Դϴ�.");	
		
	}

}
