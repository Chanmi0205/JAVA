
public class Main {
	
	public static void main(String[] args) {
		
	double a = 10.3;
	double b = 9.6;
	double c =  10.1;
	
	int d = 200;
	
	String name = "Park chanmi";
	
	System.out.print((a+b+c) / 3);
	
	System.out.println("\n");


	for(char i='a'; i<='z'; i++) {
		System.out.print(i+" ");
	 }
	
	System.out.println("\n");
	
	
	System.out.println("10���� : " + d);
	System.out.format("8���� : %o\n", d); //%o : ����������
	System.out.format("16���� : %x", d);
	
	System.out.println("\n");
	
	
	System.out.println(name);
	System.out.println(name.substring(0, 4));
	System.out.println(name.substring(5, 11));
	
	}
	

}
