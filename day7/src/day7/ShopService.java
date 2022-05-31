package day7;

// 싱글톤 패턴 : 이 클래스가 단 하나의 객체만을 가지도록 보장!
public class ShopService {
	
	// 정적 키워드 넣야함(static)
	public static ShopService singleton;
	
	private ShopService() {}
	
	public static ShopService getInstance() {
		if(singleton == null) {
			singleton = new ShopService();
		} 
		return singleton;
	}
}