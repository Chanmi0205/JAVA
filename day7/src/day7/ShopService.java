package day7;

// �̱��� ���� : �� Ŭ������ �� �ϳ��� ��ü���� �������� ����!
public class ShopService {
	
	// ���� Ű���� �־���(static)
	public static ShopService singleton;
	
	private ShopService() {}
	
	public static ShopService getInstance() {
		if(singleton == null) {
			singleton = new ShopService();
		} 
		return singleton;
	}
}