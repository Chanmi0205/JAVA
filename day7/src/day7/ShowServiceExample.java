package day7;

public class ShowServiceExample {
	public static void main(String[] args) {
		
		ShopService test = ShopService.getInstance();
		ShopService test2 = ShopService.getInstance();
		
		System.out.println(ShopService.getInstance());
		
		if(test == test2)
			System.out.println("���� �ּ����� ������ �ֽ��ϴ�.");
	}

}