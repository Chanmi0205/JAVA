
public class operator {
	
	public static void main(String[] args) {
		
		//    5        +       3
		// (�ǿ�����) (������) (�ǿ�����)
		
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
		// z = 12 + 1 (11 �����ϰ� 1 ����)
		z = x++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		
		System.out.println("------------------");
		// z = 13 + 1 ( 1�߰��ϰ� x, z�� 13 ���� )
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
