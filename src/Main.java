
public class Main {
	
	final static double PI = 3.141592;
	final static int INT_MAX = 2147483647;
	
	public static void main(String[] args) {
		
		int intType = 100;
		double doubleType = 150.5;
		String stringType = "박찬미";
		int r = 30;
		int a = INT_MAX;
		int b = 10;
		int c = 5;
		
		System.out.println(intType);
		System.out.println(doubleType);
		System.out.println(stringType);
		System.out.println("\n");
		
		System.out.println(r*r*PI);
		System.out.println("\n");
		
	System.out.println(a+1); //오버풀로
	System.out.println("\n");
	
	System.out.println("b+c= " + (b+c));
	System.out.println("b-c= " + (b-c));
	System.out.println("b*c= " + (b*c));
	System.out.println("b/c= " + (b/c));
	}
	

}
