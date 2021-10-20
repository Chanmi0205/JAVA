
public class Main {
	
	public static int factorial(int number) {
		int sum = 1;
		for ( int i=2; i<=number; i++ ) {
			sum *= i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("10 ÆÑÅä¸®¾óÀº " + factorial(10));
	}

}
