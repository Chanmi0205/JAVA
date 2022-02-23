
public class Cafe {
	
	int GuestCount = 0; // 카페 이용하고 있는 수
	int money = 0; // 카페 수입
	String CafeName; // 카페 이름
	
	public Cafe(String CafeName) {
		this.CafeName = CafeName;
	}
	
	public void Drink(int money) {
		this.money += money;   // 카페 수입 증가
		GuestCount++;   // 카페 이용 인원
	}
	
	public void showInfo() {
		System.out.println(CafeName + "는 현재 " + GuestCount + "명 관람하고 있으며, 수입은 " + money + "원 입니다.");
	}

}
