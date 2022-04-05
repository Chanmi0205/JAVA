
public class operator {
	
	public static void main(String[] args) {
		
		//    5        +       3
		// (피연산자) (연산자) (피연산자)
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------");
		x++;
		++x;
		System.out.println("x= " + x);
		
		
		System.out.println("------------------");
		y--;
		--y;
		System.out.println("y= " + y);
		
		
		System.out.println("------------------");
		// z = 12 + 1 (11 대입하고 1 증가)
		z = x++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		
		System.out.println("------------------");
		// z = 13 + 1 ( 1추가하고 x, z에 13 삽입 )
		z = ++x;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		
		System.out.println("------------------");
		z = ++x + y++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
	}

}
